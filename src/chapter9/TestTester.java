package chapter9;

// TestTester.java
public class TestTester {

    private static double sub;

    public static void main(String[] args) {
        // Testing Cake
        Cake cake = new Cake("Chocolate");
        System.out.println("Cake Flavor: " + cake.getFlavor());
        System.out.println("Cake Price: $" + cake.getPrice());
        System.out.println();

        // Testing BirthdayCake
        OrderBirthDayCake();

        // Testing WeddingCake
        OrderWeddingCake();

    }

    public static void OrderBirthDayCake() {
        BirthdayCake birthdayCake = new BirthdayCake("Vanilla");
        birthdayCake.setCandles(27); // Set candles
        int Misc = birthdayCake.getCandles();
        sub = Misc * 0.75;
        System.out.println("Birthday Cake Flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake Price: $" + (birthdayCake.getPrice()+sub));
        System.out.println("Number of Candles: " + birthdayCake.getCandles());
        System.out.println();
    }

    public static void OrderWeddingCake(){
        WeddingCake weddingCake = new WeddingCake("Red Velvet");
        weddingCake.setTiers(7); // Set tiers
        int Misc = weddingCake.getTiers();
        sub = Misc * 7.25;
        System.out.println("Wedding Cake Flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price: $" + (weddingCake.getPrice()+sub));
        System.out.println("Number of Tiers: " + weddingCake.getTiers());

    }

}

