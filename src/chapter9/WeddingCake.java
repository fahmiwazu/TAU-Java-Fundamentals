package chapter9;

// WeddingCake.java
public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake(String flavor) {
        super(flavor);
    }

    // Getter and Setter for tiers
    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}

