package com.gmail.pinkavsky;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Employee(20,4,0);
        Employee developer = new Employee(40, 5, 100);
        Employee scrumMaster = new Employee(30, 5,0);
        Company comp1 = new Company("Cats", 4000);
        comp1.addEmployee(manager);
        comp1.addEmployee(developer);
        comp1.addEmployee(scrumMaster);
        comp1.getSalaryService().pay(comp1);
        System.out.println(comp1.getBudget());

    }
}
