package com.experimental.firstservice.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.Instant;

/**
 * Created by Serdar Turkmen on 15.04.2018
 */
@Entity
public class Departments {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    @Column(name = "MANAGER_ID")
    private Long managersId;

    @Column(name = "LOCATION_ID")
    private Long locationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
