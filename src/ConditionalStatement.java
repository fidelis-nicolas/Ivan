import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");

        String password = scanner.nextLine();

        if(password.equals("Ivan")){
            System.out.println("Welcome!!");
        }else {
            System.out.println("Incorrect password");
        }
    }
}
