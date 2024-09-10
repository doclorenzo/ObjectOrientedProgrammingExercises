package esercizi_collections.Map;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordFrequency {

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static Map<String, Integer> wordFrequency(String filename) throws IOException {

        HashMap<String,Integer> ret = new HashMap<String,Integer>();
        List<String> values = new ArrayList<String>();

        for(String line : getLines(filename)){
            values.addAll(lineToWords(line));
        }

        Set<String> keys = new HashSet<String>(values);
        for(String key : keys){
            int cont=0;
            while(values.remove(key)) cont++;
            ret.put(key,cont);
        }
    return ret;
    }

}
