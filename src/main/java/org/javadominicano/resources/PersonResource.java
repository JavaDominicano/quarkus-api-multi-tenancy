package org.javadominicano.resources;

import java.util.List;

import org.javadominicano.dto.PersonDTO;
import org.javadominicano.model.Person;
import org.javadominicano.services.PersonService;

import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

@Path("/persons")
@RequiredArgsConstructor
public class PersonResource {

    private final PersonService personService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Person> getAll() {
        return personService.getAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person create(@NotNull PersonDTO personDTO) {
        return personService.create(personDTO);
    }
}
