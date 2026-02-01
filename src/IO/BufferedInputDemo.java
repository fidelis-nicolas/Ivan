package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream file = new BufferedInputStream(new FileInputStream("data.txt"));
        int data;

        while((data = file.read()) !=-1){
            System.out.print((char)data);
        }
    }
}
