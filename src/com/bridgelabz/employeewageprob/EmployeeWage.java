package com.bridgelabz.employeewageprob;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();

        int attendance = random.nextInt(2);

        int wagePerHour = 20;
        int fullDayHour = 8;

        int dailyWage = 0;

        if (attendance == 1) {
            System.out.println("Employee is Present.");

            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent.");
        }
    }
}
