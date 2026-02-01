package exception_handling;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try{
            createFile("Names");
        }catch (IOException e){
            e.printStackTrace();
        }catch (SQLException e){

        }

    }

    public static void createFile(String fileName)throws IOException, SQLException {
        File file = new File(fileName);
            file.createNewFile();

    }
}
