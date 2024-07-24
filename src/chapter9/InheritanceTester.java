package chapter9;

public class InheritanceTester{

    public static void main(String[] args){

        TestInheritance();

        TestSquareOverrides();

        TestInheritanceChain();



    }

    public static void TestSquareOverrides(){
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print("square");
    }

    public static void TestInheritance(){
        Person person = new Person();
        Employee employee = new Employee();
    }

    public static void TestInheritanceChain(){
        Mother mom = new Mother();
        mom.setName("Shofiyah");

        System.out.println(mom.getName() + " is a " + mom.getGender());

    }


}

