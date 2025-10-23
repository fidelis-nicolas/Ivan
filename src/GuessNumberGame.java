import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 20);

        boolean isTrue = true;
        Scanner input = new Scanner(System.in);

        int numberOfGuess = 5;
        while(isTrue){
            System.out.println("Guess a number: ");
            int userNumber = input.nextInt();

            if(userNumber==number){
                System.out.println("You're correct!!!");
                isTrue = false;
            }
            else {
                numberOfGuess--;
                System.out.println("That's not correct!!");
                System.out.println("You have " + numberOfGuess + " guesses left");

                if(numberOfGuess == 0){
                    System.out.println("Game over!!");
                    System.out.print("Do you want to try again?: ");
                    String option = input.next();

                    if (option.equalsIgnoreCase("Yes")){
                        numberOfGuess = 5;
                        continue;
                    }else {
                        isTrue = false;
                    }

                }

            }


        }
    }
}
