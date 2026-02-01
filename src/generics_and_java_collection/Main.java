package generics_and_java_collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GenericsDemo<String> name = new GenericsDemo<>("Fidelis");

        GenericsDemo<Integer> number = new GenericsDemo<>(464646);

        System.out.println(name.getT());

        GenericsWithTwoTypes<Integer, String> phoneBook = new GenericsWithTwoTypes<>(5, "Ivan");
        System.out.println(phoneBook.getKey() + " " + phoneBook.getValue());


    }
}
