package com.bridgelabz.employeewageprob;

import java.util.Random;

public class EmployeeWageCalculator {

    public static int calculateEmployeeWage(String companyName, int wagePerHour, int fullDayHour, int partTimeHour,
                                            int workingDaysPerMonth, int totalWorkingHoursLimit) {
        Random random = new Random();

        int monthlyWage = 0;
        int totalWorkingHours = 0;
        int currentDay = 0;

        while (currentDay < workingDaysPerMonth && totalWorkingHours < totalWorkingHoursLimit) {
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

            System.out.println(companyName + " - Day " + (currentDay + 1) + ": " + attendanceType + " - Daily Wage: " + dailyWage);
            monthlyWage += dailyWage;
            totalWorkingHours += (attendance == 1) ? fullDayHour : (attendance == 2) ? partTimeHour : 0;
            currentDay++;
        }

        System.out.println(companyName + " - Monthly Employee Wage: " + monthlyWage);
        System.out.println(companyName + " - Total Working Hours: " + totalWorkingHours);

        return monthlyWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");

        // Example usage for two companies
        int company1Wage = calculateEmployeeWage("Company1", 25, 8, 4, 22, 120);
        int company2Wage = calculateEmployeeWage("Company2", 30, 9, 5, 20, 100);

        // You can use the calculated wages for further processing or display
        System.out.println("Total Monthly Wage for Company1: " + company1Wage);
        System.out.println("Total Monthly Wage for Company2: " + company2Wage);
    }
}
