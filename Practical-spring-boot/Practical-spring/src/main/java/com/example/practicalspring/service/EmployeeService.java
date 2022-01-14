package com.example.practicalspring.service;

import com.example.practicalspring.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee update(Employee employee);

    List<Employee> findAll();

    Optional<Employee> findById(int id);

    boolean delete(Employee employee);
}
