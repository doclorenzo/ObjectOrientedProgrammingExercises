package esercizi_functional;

import java.util.List;
import java.util.stream.Collectors;

public class SquareFive {

    public static long squareFive(List<Integer> nums){

        return nums.stream()
                .map(x -> (x * x) + 10)
                .filter(x -> x % 5 != 0)
                .count();

    }

}
