package chapter11;

// Concrete subclass Duck extending Animal
class Duck extends Animal {
    // Implementing the abstract method makeSound() from Animal
    @Override
    public void makeSound() {
        System.out.println("Duck says quack quack");
    }
}

