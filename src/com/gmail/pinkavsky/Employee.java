package com.gmail.pinkavsky;

public class Employee {
    private double ratePerHour;
    private int workdays;
    private double bonus;

    public Employee(double ratePerHour, int workdays, double bonus) {
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
        this.bonus=bonus;
    }

    public Employee() {
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }
    public double getSalary(){
        double sallary= (ratePerHour*workdays*8)+ bonus;
        return sallary;
    }
}
