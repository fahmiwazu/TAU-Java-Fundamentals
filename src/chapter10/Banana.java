package chapter10;

class Banana extends Fruit {
    public Banana(int calories) {
        super(calories);
    }

    public void peel() {
        System.out.println("Banana peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made");
    }
}
