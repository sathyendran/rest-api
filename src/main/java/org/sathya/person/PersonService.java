package org.sathya.person;

import java.util.List;

public interface PersonService {
    Person save(Person person);

    Person update(Person personRequest);

    PersonListResponse getPersons();

    Person delete(long id);
}
