package writefile;
import java.io.*;

import java.io.FileWriter;

public class writefile {
    public static void main(String[] args){

        String filePath = "C:\\Users\\Richard\\Desktop\\test.txt";
        //String textContent = "I like pizza!\nIt'really good.\nBuy me pizza!";
        String textContent = """
                Roses are Red
                Violets are blue
                BOOTY BOOTY BOOTY 
                ROCKIN' EVERYWHERE
                """;

        try(FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
