package chapter11;

public class Triangle extends Shape{
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height){
        setBase(base);
        setHeight(height);
    }

    @Override
    double calculateArea() {
        return (base * height) / 2 ;
    }

    @Override
    public void print(){
        System.out.println("I am a Triangle");
    }
}
