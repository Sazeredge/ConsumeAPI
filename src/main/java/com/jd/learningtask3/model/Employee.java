package com.jd.learningtask3.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private Long id;
    private String employee_name;
    private Long employee_salary;
    private Integer employee_age;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public Long getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Long employee_salary) {
        this.employee_salary = employee_salary;
    }

    public Integer getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(Integer employee_age) {
        this.employee_age = employee_age;
    }
}
