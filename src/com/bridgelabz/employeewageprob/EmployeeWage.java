package com.bridgelabz.employeewageprob;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();

        int wagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4; // Assuming part-time hours as 4
        int workingDaysPerMonth = 20;

        int monthlyWage = 0;

        // Loop for each working day in the month
        for (int day = 1; day <= workingDaysPerMonth; day++) {
            // Generate a random number (0, 1, or 2) to represent attendance (0: absent, 1: full-time, 2: part-time)
            int attendance = random.nextInt(3);

            String attendanceType;
            int dailyWage = 0;

            switch (attendance) {
                case 1:
                    attendanceType = "Full-time";
                    dailyWage = wagePerHour * fullDayHour;
                    break;
                case 2:
                    attendanceType = "Part-time";
                    dailyWage = wagePerHour * partTimeHour;
                    break;
                default:
                    attendanceType = "Absent";
                    break;
            }

            // Display the type of attendance and daily wage for the current day
            System.out.println("Day " + day + ": " + attendanceType + " - Daily Wage: " + dailyWage);

            // Accumulate the total monthly wage
            monthlyWage += dailyWage;
        }

        // Display the monthly employee wage
        System.out.println("Monthly Employee Wage: " + monthlyWage);
    }
}
