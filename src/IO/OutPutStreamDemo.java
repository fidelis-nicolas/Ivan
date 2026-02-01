package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutPutStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("data.txt", true);
            String data = "\nNote File input and output stream is slower";
            file.write(data.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
