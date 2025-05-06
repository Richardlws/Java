package ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args){

        String filePath = "C:\\Users\\Richard\\Desktop\\test.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            //System.out.println("That file exists");
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }


    }
}
