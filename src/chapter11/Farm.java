package chapter11;

// Farm class to test Animal subclasses
public class Farm {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal duck = new Duck();

        pig.makeSound();  // Outputs: Pig says oink oink
        pig.eat();        // Outputs: Animal is eating

        System.out.println();

        duck.makeSound(); // Outputs: Duck says quack quack
        duck.eat();       // Outputs: Animal is eating
    }
}

