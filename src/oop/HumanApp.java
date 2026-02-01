package oop;

public class HumanApp {
    public static void main(String[] args) {
        Human firstHuman = new Human("Ivan", 67, "Male", "White", "Ukraine");// Instance of the Human class
        Human secondHuman = new Human("Maryna", 19, "Female", "White", "Ukraine");
        Human thirdHuman = new Human("Alex", 55, "Male", "Dark", "Ireland");
        Human fourthHuman = new Human("Yulia", 32, "Female", "White", "Spain");
        Human fifthHuman = new Human("Fidelis", 23, "Male", "Dark", "Nigeria");

        //TODO: Create 5 humans and add them to the customer array
        Human [] customers = {firstHuman,secondHuman,thirdHuman,fourthHuman,fifthHuman};

        //TODO: display all human details
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Human information: ");
            System.out.println(customers[i].humanInfo());
            System.out.println("");
        }

        //TODO: Display all human that are male

        System.out.println("All male humans are below: ");
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getSex().equalsIgnoreCase("Male")){
                System.out.println(customers[i].humanInfo());
                System.out.println("");
            }

        }
        //TODO: Display all human that more than 20 years old.
        System.out.println("All humans older than 20 years old :");
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getAge() > 20){
                System.out.println(customers[i].humanInfo());
            }
        }




    }
}
