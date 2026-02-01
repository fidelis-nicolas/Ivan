package IO;

import java.io.*;
import java.util.ArrayList;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));


        ArrayList<String> myFile = new ArrayList<>();
        String line;
        while((line = reader.readLine()) !=null){
            myFile.add(line);
        }

        System.out.println(myFile);

        myFile.set(4, "This is a new text");

        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
        for(String file: myFile){
            writer.write(file);
            writer.newLine();
        }


    }
}
