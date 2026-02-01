package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("data.txt");

        int ch;
        while((ch = file.read()) != -1){
            System.out.print((char) ch);

        }
    }
}
