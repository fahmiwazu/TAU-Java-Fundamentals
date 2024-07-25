package chapter11;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        setRadius(radius);
    }

    @Override
    double calculateArea() {
        return (3.14)*radius*radius;
    }

    @Override
    public void print(){
        System.out.println("I am a Circle");
    }

}
