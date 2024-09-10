package esercizi_functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYY {

    public static List<String> noYY(List<String> strings){

        return strings.stream()
                .map(x->x+"y")
                .filter(x->!x.contains("yy"))
                .collect(Collectors.toList());

    }

}
