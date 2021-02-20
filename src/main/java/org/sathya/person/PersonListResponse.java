package org.sathya.person;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PersonListResponse implements Serializable {
    List<Person> person;
}
