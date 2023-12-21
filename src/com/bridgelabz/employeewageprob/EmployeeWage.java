package com.bridgelabz.employeewageprob;

import java.util.Random;


public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program.");
        Random random = new Random();

        // Generate a random number (0 or 1) to represent attendance (0: absent, 1: present)
        int attendance = random.nextInt(2);

        if (attendance == 1) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }
}
