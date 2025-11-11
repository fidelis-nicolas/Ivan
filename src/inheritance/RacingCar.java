package inheritance;

public class RacingCar extends SportCar{
    private String nitro;

    public RacingCar(String brand, int year, String color, double price, String turbo, String nitro){
        super(brand, year, color, price, turbo);
        this.nitro = nitro;
    }


    public String getNitro() {
        return nitro;
    }

    public void setNitro(String nitro) {
        this.nitro = nitro;
    }
}
