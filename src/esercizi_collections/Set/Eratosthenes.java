package esercizi_collections.Set;

import java.util.*;

import static java.lang.Math.sqrt;

public class Eratosthenes {

    public static Set<Integer> multipli(int n, int max){

        Set<Integer> ret = new HashSet<Integer>();
        int cont=n;
        while(cont<max){
            ret.add(cont);
            cont+=n;
        }
        return ret;
    }

    public static Set<Integer> eratosthenes(int n) {

        Set<Integer> ret = new LinkedHashSet<Integer>();
        for(int i=2; i<n; i++) {
           ret.add(i);
        }

        for(int i=2; i<(int)sqrt(n); i++){
            if(ret.contains(i)) ret.removeAll(multipli(i,n));
        }
       return ret;
    }
}
