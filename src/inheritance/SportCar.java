package inheritance;

public class SportCar extends Car{
    private String turbo;

    public SportCar(String brand, int year, String color, double price, String turbo){
        super(brand, year, color, price);
        this.turbo = turbo;
    }

    public SportCar(){
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", year=" + getYear() +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                ", turbo=" + turbo +

                '}';
    }

    @Override
    public void design(String color, int rimSize){


    }
}
