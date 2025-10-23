import java.util.Scanner;

public class LoopsInJava {
    public static void main(String[] args) {
        //
        int i = 100;

//        while(i >=0 ){
//            System.out.println(i);
//            i--;
//        }

//        for(int x=0; x<=100; x+=5){
//            System.out.println(x);
//        }
//
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=100);
//    }

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (password.equals("Fidelis")){
                System.out.println("Welcome");
                isTrue = false;
            }
            else {
                System.out.println("Invalid password");
                continue;
            }
        }

    }

}
