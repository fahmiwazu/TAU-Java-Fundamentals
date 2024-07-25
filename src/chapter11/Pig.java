package chapter11;

// Concrete subclass Pig extending Animal
class Pig extends Animal {
    // Implementing the abstract method makeSound() from Animal
    @Override
    public void makeSound() {
        System.out.println("Pig says oink oink");
    }
}

