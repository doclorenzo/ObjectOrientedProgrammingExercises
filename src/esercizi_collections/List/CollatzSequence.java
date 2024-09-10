package esercizi_collections.List;

import java.util.ArrayList;
import java.util.List;

public class CollatzSequence {
    public static List<Long> collatzSequence(long n){
        List<Long> col = new ArrayList<Long>();
        col.add(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else {
                n*=3;
                n++;
            }
            col.add(n);
        }
       return col;
    }
}
