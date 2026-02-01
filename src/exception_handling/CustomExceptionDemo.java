package exception_handling;

public class CustomExceptionDemo {
    public static void main(String[] args) {

            //checkCountry("Ukr");

    }

    public static void checkCountry(String country)throws MyException{
        if(!(country.equalsIgnoreCase("Ukraine"))){
           throw new MyException("You are not from Ukraine");
        }
    }
}
