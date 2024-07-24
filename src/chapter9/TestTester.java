package chapter9;

// TestTester.java
public class TestTester {
    public static void main(String[] args) {
        // Testing Cake
        Cake cake = new Cake("Chocolate");
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price: $" + cake.getPrice());
        System.out.println();

        // Testing BirthdayCake
        BirthdayCake birthdayCake = new BirthdayCake("Vanilla");
        birthdayCake.setCandles(27); // Set candles
        System.out.println("Birthday Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake Price: $" + birthdayCake.getPrice());
        System.out.println("Number of Candles: " + birthdayCake.getCandles());
        System.out.println();

        // Testing WeddingCake
        WeddingCake weddingCake = new WeddingCake("Red Velvet");
        weddingCake.setTiers(7); // Set tiers
        System.out.println("Wedding Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price: $" + weddingCake.getPrice());
        System.out.println("Number of Tiers: " + weddingCake.getTiers());
    }
}

