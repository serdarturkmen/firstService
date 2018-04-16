package com.experimental.firstservice.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Serdar Turkmen on 15.04.2018
 */
@Entity
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "employee_id")
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String firstName;


    @NotNull
    @Column(nullable = false)
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    @Column(nullable = false)
    @ManyToOne
    private Long departmentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
