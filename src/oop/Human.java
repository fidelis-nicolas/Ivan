package oop;

public class Human {
    //Attributes
    private String name;
    private int age;
    private String sex;
    private String complexion;
    private String country;

    //final String name = "Fidelis";


    public Human(String name, int age, String sex, String complexion, String country){
        this.name = name;
        this.age = age;
        this.complexion = complexion;
        this.country = country;


       if(sex.equalsIgnoreCase("Male")){
           this.sex = sex;
       }
       else if (sex.equalsIgnoreCase("Female")){
           this.sex = sex;
       }else{
           this.sex = null;
       }
    }

    public Human(int age, String name,  String sex, String country){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
    }
    //No Args constructor
    public Human(){

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //TODO: Complete




    private void eat(){
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
