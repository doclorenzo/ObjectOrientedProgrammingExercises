package esercizi_functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {

    public static List<Integer> noTeen(List<Integer> nums){

        return nums.stream()
                .filter(x -> x <= 13 || x >= 19)
                .collect(Collectors.toList());
    }

}
