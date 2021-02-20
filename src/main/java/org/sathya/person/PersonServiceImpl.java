package org.sathya.person;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@Log4j2
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person save(Person person) {
        log.info("Creating a person {} ", person);
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        log.info("Updating the for id {} person {} ", person.getId(), person);
        return personRepository.save(person);
    }

    @Override
    public PersonListResponse getPersons() {
        log.info("Getting all the person information");
        PersonListResponse personListResponse = new PersonListResponse();
        List<Person> persons = personRepository.findAll();
        if (!persons.isEmpty()) {
            personListResponse.setPerson(persons);
        }
        return personListResponse;
    }

    @Override
    public Person delete(long id) {
        log.info("Deleting the person for  id {} ", id);
        Optional<Person> byId = personRepository.findById(id);
        if (!byId.isPresent()) {
            throw new PersonException("Resource not available for id", HttpStatus.NOT_FOUND);
        }
        Person person = byId.get();
        personRepository.deleteById(id);
        return person;
    }
}
