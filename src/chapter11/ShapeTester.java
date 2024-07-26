package chapter11;

public class ShapeTester {

    public static void main(String[] args){

        Shape rectangle = new Rectangle(5,7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());

        Shape circle = new Circle(7);
        circle.print();
        System.out.println(circle.calculateArea());

        Shape triangle = new Triangle(4,5);
        triangle.print();
        System.out.println(triangle.calculateArea());

    }
}
