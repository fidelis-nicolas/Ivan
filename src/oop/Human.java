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


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

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
        builder.append("Name: " + name + "; ");
        builder.append("Age: " + age + "; ");
        builder.append("Sex: " + sex + "; ");
        builder.append("Complexion: " + complexion + "; ");
        builder.append("Country: " + country + ". ");


        return builder.toString();
    }



}
