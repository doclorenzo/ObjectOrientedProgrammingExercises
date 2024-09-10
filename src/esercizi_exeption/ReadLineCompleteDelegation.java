package esercizi_exeption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineCompleteDelegation {

    public static String readLineCompleteDelegation(String filename) throws IOException {

        try(BufferedReader lineBuffer= new BufferedReader(new FileReader(filename))){
            String line = lineBuffer.readLine();
            return line;
        }
    }
}
