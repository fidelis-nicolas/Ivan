package java_collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ivan");
        names.add("Nelson");
        names.add("FIdelis");

        System.out.println(names.get(1));
        names.remove(1);
        System.out.println(names);
    }
}
