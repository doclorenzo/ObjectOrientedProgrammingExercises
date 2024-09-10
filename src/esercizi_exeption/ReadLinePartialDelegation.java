package esercizi_exeption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinePartialDelegation {

    public static String readLinePartialDelegation(String filename){
        try(BufferedReader lineBuffer= new BufferedReader(new FileReader(filename))){
            String line = lineBuffer.readLine();
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
