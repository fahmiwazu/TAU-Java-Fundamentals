package chapter9;

// Cake.java
public class Cake {
    private String flavor;
    private double price;

    public Cake(String flavor) {
        this.flavor = flavor;
        // Default price for any cake, can be overridden in subclasses
        this.price = 15.0;
    }

    // Getter and Setter for flavor
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

