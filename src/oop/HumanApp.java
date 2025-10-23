package oop;

public class HumanApp {
    public static void main(String[] args) {
        Human firstHuman = new Human(); // Instance of the Human class

        firstHuman.age = 30;
        firstHuman.name = "Ivan";
        firstHuman.sex = "Male";
        firstHuman.country = "Ukraine";
        firstHuman.complexion = "white";

        System.out.println(firstHuman.humanInfo());
       String dance = firstHuman.dance("Pop");

        System.out.println(dance);

    }
}
