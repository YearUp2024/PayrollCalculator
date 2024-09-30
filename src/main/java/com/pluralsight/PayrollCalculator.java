package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of hours worked per week: ");
        int hoursWorkedPerWeek = scanner.nextInt();


        System.out.print("What is your hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();

        double grossPay;
        if(hoursWorkedPerWeek > 40){
            int hoursOverWorked = hoursWorkedPerWeek - 40;
            grossPay = (40 * hourlyPayRate) + (hoursOverWorked * hourlyPayRate * 1.5);
        }else{
            grossPay = hoursWorkedPerWeek * hourlyPayRate;
        }

        System.out.printf("Hi %s, your gross income is $%.2f%n", name, grossPay);
    }
}