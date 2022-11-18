package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {


    public static void main(String[] args)  {

      readFileLineByLine();

    }

    public static void readFileLineByLine(){

        try {
            BufferedReader rf = new  BufferedReader(new FileReader("src\\main\\java\\day28abstraction\\dosya.txt"));

            String line = rf.readLine();

            while (line!=null){
                System.out.println(line);
                line=rf.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
