package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args)throws IOException {
        FileWriter writer = new FileWriter("data.txt");

        String text = "This is file writer";

        writer.write(text);

        writer.close();
    }
}
