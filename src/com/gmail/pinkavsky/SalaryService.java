package com.gmail.pinkavsky;

import java.util.Set;

public class SalaryService {
    public void pay(Company company){
        double budgetC = company.getBudget();
         Set<Employee> emp = company.getEmployees();
        for (Employee e:emp) {
            budgetC = budgetC - e.getSalary();
            if (budgetC>=0) {
                company.setBudget(budgetC);
            }else if (budgetC<0){
                System.out.println("Not enough money");
                break;
            }

        }


    }
}
