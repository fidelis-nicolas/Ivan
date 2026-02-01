package exception_handling;

public class FinallyDemo {
    public static void main(String[] args) {
        try{
            System.out.println(5/0);
        }

        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Still works if exception occur or not");
        }

    }
}
