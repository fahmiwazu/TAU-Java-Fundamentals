package chapter10;

public class Zoo {

    public static void main(String[] args){

        Dog Guks = new Dog();
        Guks.fetch();
        Guks.makeSound();
        feed(Guks);

        Animal laster = new Dog();
        laster.makeSound();
        feed(laster);

        laster = new Cat();
        laster.makeSound();
        ((Cat) laster).scratch();
        feed(laster);

    }

    public static void feed(Animal animal){
        if(animal instanceof Dog)
            System.out.println("here your bone");

        if(animal instanceof Cat)
            System.out.println("here your fish");

    }

}
