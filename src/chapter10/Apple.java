package chapter10;

class Apple extends Fruit {
    public Apple(int calories) {
        super(calories);
    }

    public void removeSeeds() {
        System.out.println("Seeds removed from apple");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }
}
