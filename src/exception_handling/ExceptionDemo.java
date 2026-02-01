package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

// A single try block can have multiple catch block
        try {
            int number = scanner.nextInt();
            System.out.println(number);

            System.out.println(10 / 0);
        }
         catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
            e.printStackTrace();
        }catch (InputMismatchException p){
            System.out.println("Enter a number only");
        }
        catch (Exception e) {
            System.out.println("There is an error");
        }


    }
}
