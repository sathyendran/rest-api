package org.sathya.person;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data

public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private long id;

    @Column(name = "first_name")
    @JsonProperty("first_name")
    private String firstName;

    @Column(name = "last_name")
    @JsonProperty("last_name")
    private  String lastName;

    @Column(name = "age")
    @JsonProperty("age")
    private int age;

    @Column(name = "favourite_colour")
    @JsonProperty("favourite_colour")
    private String favouriteColour;
}
