package esercizi_functional;

import java.util.Map;
import java.util.stream.Collectors;

public class PayOnAverage {

    public static Map<String, Double> payOnAverage(Map<String, Double> fees){

        return fees.entrySet().stream()
                .collect(Collectors.groupingBy(
                        x -> x.getKey().substring(0,2),
                        Collectors.averagingDouble(Map.Entry::getValue)
                ));


    }

}
