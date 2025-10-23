package oop;

public class Human {
    //Attributes
    public String name;
    public int age;
    public String sex;
    public String complexion;
    public String country;

    public void eat(){
        System.out.println("Eating...");
    }

    public String dance(String music){
        return "Dancing to......" + music;
    }

    public void watchMovie(String movie, String typeOfMovie){
        System.out.println("Watching " + movie + "type of movie: " + typeOfMovie);
    }

    public String humanInfo(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name);

        return builder.toString();
    }



}
