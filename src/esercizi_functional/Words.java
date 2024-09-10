package esercizi_functional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {

    public static long howManyLines(String filename, String subString) throws IOException {

        List<String> lines=new ArrayList<String>(getLines(filename));

        return lines.stream()
                .filter(x-> x.contains(subString))
                .count();
    }
    public static long howManyTimes(String filename, String word) throws IOException{

        List<String> collect = getLines(filename).stream()
                .flatMap(x -> lineToWords(x).stream())
                .toList();

        return collect.stream()
                .filter(x->x.equals(word))
                .count();
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }

    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    }

