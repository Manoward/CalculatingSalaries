package com.gmail.pinkavsky;

import java.util.HashSet;
import java.util.Set;

public class Company {
    private String name;
    private double budget;
    private Set<Employee> employees = new HashSet<Employee>();

    public Company(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Set getEmployees() {
        return employees;
    }


    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public SalaryService getSalaryService (){
        SalaryService salaryService = new SalaryService();
        return salaryService;
    }

}
