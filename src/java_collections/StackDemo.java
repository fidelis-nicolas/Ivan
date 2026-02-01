package java_collections;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Fidelis");
        names.push("Ivan");

        System.out.println(names);
        names.pop();

        System.out.println(names);
    }
}
