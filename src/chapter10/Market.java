package chapter10;

public class Market {
    public static void main(String[] args) {
        // Testing polymorphism
        Fruit fruit1 = new Apple(95);
        Fruit fruit2 = new Banana(105);

        fruit1.makeJuice(); // Calls Apple's makeJuice() method
        ((Apple) fruit1).removeSeeds(); // Casting to call Apple's specific method
        System.out.println("Calories in apple: " + fruit1.calories);

        System.out.println();

        fruit2.makeJuice(); // Calls Banana's makeJuice() method
        ((Banana) fruit2).peel(); // Casting to call Banana's specific method
        System.out.println("Calories in banana: " + fruit2.calories);
    }
}
