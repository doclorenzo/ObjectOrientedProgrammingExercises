package esercizi_functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {

    public static List<String> noYYZ(List<String> strings){

        return strings.stream()
                .map(x->x+"y")
                .filter(x->!x.contains("yy"))
                .peek(x-> {
                    if(x.startsWith("z")) System.out.println(x);
                })
                .collect(Collectors.toList());

    }

}
