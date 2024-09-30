package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        String userName = promptForUserName("What is your name: ");

        int hoursWorked = promptForNumberOfHoursWorked("How many hours in a week did you work: ");

        double hourlyPayRate = promptForHourlyRate("What is your hourly pay rate: ");

        double grossPay = calculateGrossPay(hoursWorked, hourlyPayRate);

        System.out.printf("Hi %s, your gross income is $%.2f%n", userName, grossPay);
    }

    public static String promptForUserName(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String name = scanner.nextLine();
        return name;
    }

    public static int promptForNumberOfHoursWorked(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int hours = scanner.nextInt();
        return hours;
    }

    public static double promptForHourlyRate(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        double hourlyRate = scanner.nextDouble();
        return hourlyRate;
    }

    public static double calculateGrossPay(int hoursWorkedPerWeek, double hourlyPayRate){
        double total;
        if(hoursWorkedPerWeek > 40){
            int hoursOverWorked = hoursWorkedPerWeek - 40;
            total = (40 * hourlyPayRate) + (hoursOverWorked * hourlyPayRate * 1.5);
        }else{
            total = hoursWorkedPerWeek * hourlyPayRate;
        }
        return total;
    }
}