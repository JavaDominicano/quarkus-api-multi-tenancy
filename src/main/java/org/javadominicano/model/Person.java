package org.javadominicano.model;

import java.time.LocalDate;

import org.hibernate.annotations.TenantId;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "persons")
@Table(name = "persons")
public class Person extends PanacheEntity {

    public String firstName;
    public String lastName;
    public String email;
    public LocalDate dob;
    public String address;

    @TenantId
    public String tenantId;
}
