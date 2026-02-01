package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("data.txt");

        int data;

        while((data = file.read()) != -1){
            System.out.print((char) data);
        }
        file.close();


    }
}
