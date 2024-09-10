package esercizi_functional;

import java.util.List;
import java.util.stream.Collectors;

public class TwoTwo {

    public static List<Integer> twoTwo(List<Integer> nums){

        return nums.stream()
                .map(x->x*=2)
                .filter(x-> ((x-2)%10!=0))
                .collect(Collectors.toList());

    }

}
