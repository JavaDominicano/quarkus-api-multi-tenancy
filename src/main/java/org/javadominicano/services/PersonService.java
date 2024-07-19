package org.javadominicano.services;

import java.util.List;

import org.javadominicano.dto.PersonDTO;
import org.javadominicano.model.Person;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@ApplicationScoped
public class PersonService {

    private final ObjectMapper objectMapper;
    
    @Transactional
    public List<Person> getAll() {
        return Person.listAll();
    }

    @Transactional
    public Person create(PersonDTO personDTO) {
        Person person = objectMapper.convertValue(personDTO, Person.class);
        Person.persist(person);
        return person;
    }

}
