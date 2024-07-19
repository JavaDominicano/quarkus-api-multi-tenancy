package org.javadominicano.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private LocalDate dob;
    
}
