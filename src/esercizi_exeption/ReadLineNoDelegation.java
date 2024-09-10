package esercizi_exeption;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineNoDelegation {

    public static String readLineNoDelegation(String filename){

        try(BufferedReader r = new BufferedReader(new FileReader(filename))){
            return r.readLine();
        }
        catch(IOException e){
            return null;
        }
    }

}
