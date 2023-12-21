package com.bridgelabz.employeewageprob;

import java.util.Random;

public class Employee {
    // Class variables
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int WORKING_DAYS_PER_MONTH = 20;
    private static final int TOTAL_WORKING_HOURS_LIMIT = 100;

    // Class method to compute employee wage
    public static void computeEmployeeWage() {
        System.out.println("Welcome to Employee Wage Computation Program.");

        Random random = new Random();

        int monthlyWage = 0;
        int totalWorkingHours = 0;
        int currentDay = 0;

        while (currentDay < WORKING_DAYS_PER_MONTH && totalWorkingHours < TOTAL_WORKING_HOURS_LIMIT) {
            // Generate a random number (0, 1, or 2) to represent attendance (0: absent, 1: full-time, 2: part-time)
            int attendance = random.nextInt(3);

            String attendanceType;
            int dailyWage = 0;

            switch (attendance) {
                case 1:
                    attendanceType = "Full-time";
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case 2:
                    attendanceType = "Part-time";
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    break;
                default:
                    attendanceType = "Absent";
                    break;
            }

            // Display the type of attendance and daily wage for the current day
            System.out.println("Day " + (currentDay + 1) + ": " + attendanceType + " - Daily Wage: " + dailyWage);

            // Accumulate the total monthly wage and working hours
            monthlyWage += dailyWage;
            totalWorkingHours += (attendance == 1) ? FULL_DAY_HOUR : (attendance == 2) ? PART_TIME_HOUR : 0;

            // Move to the next working day
            currentDay++;
        }

        // Display the monthly employee wage and total working hours
        System.out.println("Monthly Employee Wage: " + monthlyWage);
        System.out.println("Total Working Hours: " + totalWorkingHours);
    }

    public static void main(String[] args) {
        // Call the class method to compute employee wage
        computeEmployeeWage();
    }
}
