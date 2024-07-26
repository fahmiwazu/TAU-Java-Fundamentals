package chapter12;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args){

//        SetDemo();
//        ListDemo();
//        QueueDemo();
        MapDemo();




    }

    public static void FinalList(){
        List unchangeableList = List.of("apple","lemon","banana");
        unchangeableList.add("orange"); //UnsupportedOperationException
        unchangeableList.remove(1); //UnsupportedOperationException
    }

    public static void SetDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.size()); //4
//        System.out.println(fruit); //[banana, orange, apple, lemon]

        var i = fruit.iterator();
        while (i.hasNext()){
            print(i.next());
        }

        // line separator
        print("");

        for (Object fruits : fruit) {
            print(fruits);
        }

        // line separator
        print("");

//        fruit.forEach(x -> print(x));
//        fruit.forEach(System.out::println);
        fruit.forEach(CollectionFramework::print);


    }

    public static void ListDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2)); //banana
        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
    }

    public static void QueueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size()); //5
        System.out.println(fruit); //[apple, lemon, banana, orange, lemon]
        fruit.remove();
        fruit.remove();
        System.out.println(fruit); //[banana, orange, lemon]
        System.out.println(fruit.peek()); //banana
    }

    public static void MapDemo(){
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

//        System.out.println(fruitCalories.size()); //4
//        System.out.println(fruitCalories); //{banana=105, orange=45, apple=95, lemon=17}
//        System.out.println(fruitCalories.get("lemon")); //17
//        System.out.println(fruitCalories.entrySet()); //[banana=105, orange=45, apple=95, lemon=17]
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories); //{banana=105, apple=95, lemon=17}

        for (var entry: fruitCalories.entrySet()){
            print(entry.getKey()+" "+entry.getValue());
        }

        fruitCalories.forEach(
                (key,val) -> print("Fruit: "+key+", Calories: "+val)
        );

    }

    public static void print(String a){
        System.out.println(a);
    }

    public static void print(Object a){
        System.out.println(a);
    }



}
