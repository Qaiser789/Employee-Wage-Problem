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
        int totalWorkingHoursLimit = 100;

        // Initialize variables for monthly employee wage and total working hours
        int monthlyWage = 0;
        int totalWorkingHours = 0;
        int currentDay = 0;

        while (currentDay < workingDaysPerMonth && totalWorkingHours < totalWorkingHoursLimit) {
            // Generate a random number (0, 1, or 2) to represent attendance (0: absent, 1: full-time, 2: part-time)
            int attendance = random.nextInt(3);

            // Variables to store the type of attendance and daily wage
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
            System.out.println("Day " + (currentDay + 1) + ": " + attendanceType + " - Daily Wage: " + dailyWage);

            // Accumulate the total monthly wage and working hours
            monthlyWage += dailyWage;
            totalWorkingHours += (attendance == 1) ? fullDayHour : (attendance == 2) ? partTimeHour : 0;

            // Move to the next working day
            currentDay++;
        }

        // Display the monthly employee wage and total working hours
        System.out.println("Monthly Employee Wage: " + monthlyWage);
        System.out.println("Total Working Hours: " + totalWorkingHours);
    }
}
