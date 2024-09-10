package esercizi_functional;

import java.util.List;
import java.util.function.Function;

public class AllPalindrome {

    public static boolean allPalindrome(List<String> strings){

        return strings.stream()
                .allMatch( x -> x.equals(reverse.apply(x)));

    }

    static Function<String,String> reverse = x->new StringBuilder(x).reverse().toString();

}
