package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    // Constants for tax rate and overage cost per minute
    private static final double TAX_RATE = 0.15;
    private static final double OVERAGE_RATE = 0.25;

    // Constructors

    // Default constructor
    public PhoneBill() {
        this.id = 0;
        this.baseCost = 50.0; // Example base cost
        this.allottedMinutes = 500; // Example allotted minutes
        this.minutesUsed = 0;
    }

    // Constructor with ID only
    public PhoneBill(int id) {
        this(); // Calls the default constructor to initialize default values
        this.id = id;
    }

    // Constructor with all fields
    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    // Methods

    // Calculate overage cost
    public double calculateOverageCost() {
        int overageMinutes = minutesUsed - allottedMinutes;
        if (overageMinutes > 0) {
            return overageMinutes * OVERAGE_RATE;
        } else {
            return 0.0;
        }
    }

    // Calculate tax
    public double calculateTax() {
        return (baseCost + calculateOverageCost()) * TAX_RATE;
    }

    // Calculate total cost
    public double calculateTotal() {
        return baseCost + calculateOverageCost() + calculateTax();
    }

    // Print itemized bill
    public void printItemizedBill() {
        System.out.println("Phone Bill Statement");
        System.out.println("ID: " + id);
        System.out.println("Base Cost: $" + baseCost);
        System.out.println("Overage Minutes: " + (minutesUsed - allottedMinutes));
        System.out.println("Overage Charge: $" + calculateOverageCost());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }

    // Getters and setters (optional, depending on need)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a PhoneBill object using different constructors
        PhoneBill bill1 = new PhoneBill();
        PhoneBill bill2 = new PhoneBill(123);
        PhoneBill bill3 = new PhoneBill(456, 60.0, 1000, 800); // Example values

        // Print itemized bills
        bill1.printItemizedBill();
        System.out.println();
        bill2.printItemizedBill();
        System.out.println();
        bill3.printItemizedBill();
    }
}
