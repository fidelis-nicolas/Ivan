package java_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Fidelis");
        students.put(3, "Ivan");
        students.put(2, "Bob");
        students.put(7, "Ivan");
        students.put(89, "Ivan");
        students.put(45, "Ivan");

        System.out.println(students.entrySet());

//        System.out.println(students.get(3));
//        System.out.println(students.keySet());
//
//        students.remove(3);
//        System.out.println(students.containsKey(3));
//
//        for(Map.Entry<Integer, String> details: students.entrySet()){
//            System.out.println("Studen id: " + details.getKey() + " names: " + details.getValue());
//        }
//
//        //Getting all the values
//
//        for(String value: students.values()){
//            System.out.println(value);
//        }
//
//        //Getting all keys
//
//        for(Integer keys : students.keySet()){
//            System.out.println(keys);
//        }
//
//        //Using Iterator
//
//        Iterator<Map.Entry<Integer, String>> itr = students.entrySet().iterator();




    }
}
