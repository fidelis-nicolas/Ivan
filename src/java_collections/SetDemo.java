package java_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Students> students = new TreeSet<>();
        students.add(new Students("Fidelis", 9));
        students.add(new Students("Ivan", 7));

        System.out.println(students);

    }
}
