package com.ems.backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String location;

    @OneToMany(mappedBy = "department", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Employee> employees;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    private List<Employee> getEmployees() {
        return this.employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
