package esercizi_collections.List;

import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n){


        int size=list.size();
        int cont=n-1;
       // size-=n;
        while(size>0){
            list.remove(cont);
            size-=n;
            cont=cont+n-1;
        }
    System.out.println(list);
    }
}
