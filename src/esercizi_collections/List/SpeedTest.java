package esercizi_collections.List;

import java.util.List;

public class SpeedTest {

    public static long insertBeginning(List<String> list, String item, int times){
        long inizio=System.nanoTime();
        for(int i=0; i<times; i++){
            list.addFirst(item);
        }
        long fine=System.nanoTime();
        return fine-inizio;
    }
    public static long insertEnd(List<String> list, String item, int times){
        long inizio=System.nanoTime();
        for(int i=0; i<times; i++){
            list.addLast(item);
        }
        long fine=System.nanoTime();
        return fine-inizio;
    }
}
