package org.javadominicano.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "persons")
@Table(name = "persons")
public class Person {
    
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dob;
    private String address;
}
