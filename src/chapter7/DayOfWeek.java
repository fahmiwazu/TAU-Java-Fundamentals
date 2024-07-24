package chapter7;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Array holding textual values of days of the week
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Prompting user to input a number corresponding to the day of the week
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) corresponding to the day of the week: ");
        int dayNumber = scanner.nextInt();

        // Checking if the input is within valid range
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        } else {
            // Printing the day of the week based on user input
            String day = daysOfWeek[dayNumber - 1]; // Adjusting index since daysOfWeek is 0-indexed
            System.out.println("The day of the week is: " + day);
        }

        scanner.close();
    }
}