package inheritance;

public class Car {
    private String brand;
    private int year;
    private String color;
    private double price;

    public Car(String brand, int year, String color, double price) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public Car(){

    }
    //Method overloading
    public void design(){
        System.out.println("Simple design");
    }
    public String design(String color){
        return color;
    }
    public void design(int color){

    }
    public void design(String color, int rimSize){
        System.out.println("Design with rim and color");

    }
    public void design(int rimSize, String color){

    }
    public void design(int rimSize, String color, String spoilers){

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}
