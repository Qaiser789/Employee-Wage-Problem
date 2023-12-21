package com.bridgelabz.employeewageprob;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();

        int attendance = random.nextInt(3);

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4; // Assuming part-time hours as 4

        int dailyWage = 0;

        if (attendance == 1) {
            System.out.println("Employee is Present (Full-time).");

            dailyWage = wagePerHour * fullDayHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else if (attendance == 2) {
            System.out.println("Employee is Present (Part-time).");

            dailyWage = wagePerHour * partTimeHour;
            System.out.println("Daily Employee Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent.");
        }
    }
}
