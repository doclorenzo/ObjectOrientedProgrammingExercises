package Secondo_giro_esercizi;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Esercizi {

    public static void main(String[] args) {

       /* List<String> list = new ArrayList<String>(List.of(new String[]{"kayak", "anna"}));
        System.out.println(list);
        System.out.println(allPalindrome(list));*/

        System.out.println(squareFive(List.of(5)));
    }

    public static boolean allPalindrome(List<String> strings){
        return strings.stream()
                .allMatch(x-> x.equals(new StringBuilder(x).reverse().toString()));
    }

    public static long squareFive(List<Integer> nums){
        return nums.stream()
                .map(x-> (x*x)+10)
                .filter(x-> (x-5)%10!=0)
                .count();
    }

    public static List<String> noYY(List<String> strings){

        return strings.stream()
                .map(x-> x+"x")
                .filter(x-> !x.contains("yy"))
                .toList();
    }

    public static void payMore(Map<String, Double> fees, String numberFamily, double costDelta){
        fees.replaceAll( (key, value) -> key.substring(0,2).equals(numberFamily) ? value+costDelta : value );
    }

    public static <T> void justPrintList(List<T> list){
        list.forEach(x-> System.out.println("Hello "+x+"!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((k,v) -> System.out.println("k: "+k+", v: "+v));
    }

    public static List<String> noYYZ(List<String> strings){
        return strings.stream()
                .map(x-> x+"y")
                .filter(x-> !x.contains("yy"))
                .peek(x -> {
                    if(x.startsWith("z")) System.out.println(x);
                })
                .toList();
    }

    public static <T> String toString(Stream<T> stream, int n){
        return stream
                .limit(n)
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }

    public static long howManyLines(String filename, String subString) throws IOException{

        return getLines(filename).stream()
                .filter(x->x.contains(subString))
                .count();

    }
    public static long howManyTimes(String filename, String word) throws IOException {

        return getLines(filename).stream()
                .flatMap(x-> lineToWords(x).stream())
                .filter(x-> x.equals(word))
                .count();
    }

    public static Map<String, Double> payOnAverage(Map<String, Double> fees){
        return fees.entrySet().stream()
                .collect(Collectors.groupingBy(x-> x.getKey().substring(0,3),
                        Collectors.averagingDouble(Map.Entry::getValue)));
    }

}
