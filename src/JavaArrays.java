import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        String [] studentNames = {"Fidelis", "Ivan", "Joe", "Bob", "Fidelis", "Dan"};

        int [] studentScores = new int[5];
        studentScores[0] = 87;
        studentScores[1] = 65;
        studentScores[2] = 73;
        studentScores[3] = 45;
        studentScores[4] = 29;

//        System.out.println(studentNames[1]);
//        studentNames[3] = "Oscar";
//        System.out.println(Arrays.toString(studentNames));
//        System.out.println(studentNames.length);

        for(int i =0; i<studentNames.length; i++){
            System.out.println("Name: " + studentNames[i] + " "+ "Score: " + studentScores[i]);
        }




    }
}
