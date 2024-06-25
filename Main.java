package com.sinemsalis.daytwo;

import com.sinemsalis.Salesperson;

public class Main {
    public static void main(String[] args) {
        Engineer employeeOne = new Engineer("Sinem Şalış", 1000000,24);

        Salesperson employeeTwo = new Salesperson("Matt Johnson", 65000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}
