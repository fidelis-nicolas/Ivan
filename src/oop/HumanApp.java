package oop;

public class HumanApp {
    public static void main(String[] args) {
        Human firstHuman = new Human("Ivan", 67, "male", "White", "Ukraine");// Instance of the Human class
        //Human secondHuman = new Human();
        System.out.println(firstHuman.humanInfo());


    }
}
