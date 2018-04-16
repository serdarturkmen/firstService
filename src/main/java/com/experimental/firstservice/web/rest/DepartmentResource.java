package com.experimental.firstservice.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.experimental.firstservice.domain.Employee;
import com.experimental.firstservice.repository.EmployeeRepository;
import com.experimental.firstservice.web.rest.errors.InternalServerErrorException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by Serdar Turkmen on 15.04.2018
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeResource {

    private EmployeeRepository employeeRepository;

    public EmployeeResource(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping()
    @Timed
    public List<Employee> findAll() {
        return;employeeRepository.findAll();

    }
}
