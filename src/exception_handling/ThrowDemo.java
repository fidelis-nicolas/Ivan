package exception_handling;

public class ThrowDemo {
    public static void main(String[] args) {
       ThrowDemo throwDemo = new ThrowDemo();
        checkAge(20);
    }

    public static void checkAge(int age){
        if(age<=20){
           throw new RuntimeException("Your age less than the age required");
        }
    }


}
