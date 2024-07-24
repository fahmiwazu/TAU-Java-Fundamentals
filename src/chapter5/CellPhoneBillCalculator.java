package chapter5;

import java.util.Scanner;

public class CellPhoneBillCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input plan fee
        System.out.print("Enter the base plan fee: $");
        double planFee = scanner.nextDouble();

        // Input overage minutes
        System.out.print("Enter the number of overage minutes: ");
        int overageMinutes = scanner.nextInt();

        scanner.close();

        // Calculate overage fees
        double overageCharge = calculateOverageCharge(overageMinutes);

        // Calculate subtotal
        double subtotal = planFee + overageCharge;

        // Calculate tax
        double tax = calculateTax(subtotal);

        // Calculate total
        double total = subtotal + tax;

        // Print itemized bill
        printBill(planFee, overageMinutes, overageCharge, tax, total);
    }

    // Method to calculate overage charge
    public static double calculateOverageCharge(int overageMinutes) {
        double overageRate = 0.25;
        return overageMinutes * overageRate;
    }

    // Method to calculate tax (15% on subtotal)
    public static double calculateTax(double subtotal) {
        double taxRate = 0.15;
        return subtotal * taxRate;
    }

    // Method to print itemized bill
    public static void printBill(double planFee, int overageMinutes, double overageCharge, double tax, double total) {
        System.out.println("\n--- Your Itemized Bill ---");
        System.out.printf("Base Plan Fee: $%.2f\n", planFee);
        System.out.printf("Overage Minutes: %d\n", overageMinutes);
        System.out.printf("Overage Charge: $%.2f\n", overageCharge);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.println("-------------------------");
        System.out.printf("Total: $%.2f\n", total);
    }
}
