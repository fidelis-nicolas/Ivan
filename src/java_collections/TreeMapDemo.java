package java_collections;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(2, "Ivan");
        students.put(1, "Fidelis");
        students.put(45, "Ivan");
        students.put(67, "Fidelis");
        students.put(27, "Ivan");
        students.put(766, "Fidelis");

        System.out.println(students.entrySet());
    }
}
