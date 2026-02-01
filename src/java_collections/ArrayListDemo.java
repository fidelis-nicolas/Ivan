package java_collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Fidelis");
        names.add("Ivan");

        ArrayList<String> food = new ArrayList<>();
        food.add("Rice");
        food.add("Potato");

        System.out.println(food.contains("Rice"));

        names.addAll(food);

        System.out.println(names);




    }
}
