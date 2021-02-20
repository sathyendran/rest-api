package org.sathya.api;

import org.sathya.person.Person;
import org.sathya.person.PersonListResponse;
import org.sathya.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return personService.update(person);
    }

    @GetMapping
    public PersonListResponse getPerson() {
        return personService.getPersons();
    }

    @DeleteMapping("/id/{id}")
    public Person delete(@PathVariable("id") long id) {

        return personService.delete(id);
    }
}
