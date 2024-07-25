package chapter10;

class Fruit {
    protected int calories;

    public Fruit(int calories) {
        this.calories = calories;
    }

    public void makeJuice() {
        System.out.println("Juice is made (generic)");
    }
}
