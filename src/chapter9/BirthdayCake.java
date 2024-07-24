package chapter9;

// BirthdayCake.java
public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake(String flavor) {
        super(flavor);
    }

    // Getter and Setter for candles
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}

