package inheritance;

import java.util.ArrayList;

public class CarApp {
    public static void main(String[] args) {
        /*
        //Upcasting Use with all freedom
        Car car = new SportCar("Ford", 2018, "red", 23.99, "Double Charger");

        //Downcasting- Use with caution
        SportCar car1 = (SportCar) new Car();
        car1.setTurbo("Singel Chargers");
      //  System.out.println(car1.toString());

         */

        Car car = new SportCar("Honda", 2017, "Green", 59494.99, "Double charger");
        System.out.println(car.toString());
        Truck truck = new Truck();

        ArrayList<Car>  cars = new ArrayList<>();
        cars.add(car);
        cars.add(truck);

        cars.remove(truck);// remove item from the list




    }
}
