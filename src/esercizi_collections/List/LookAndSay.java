package esercizi_collections.List;

import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
    public static List<Long> lookAndSay(long n){

        List<Long> seq =new ArrayList<Long>();
        int contatore=0;
        if(n==0) return seq;
        seq.add(1L);
        while (n!=0){

            String prev=seq.get(contatore).toString();
            String nuova=new String();
           int key=1;
            for(int i=0; i<prev.length(); i++){
                char cur=prev.charAt(i);
                if(i==prev.length()-1){
                    nuova+=key;
                    nuova+=cur;
                    key=1;
                    break;
                }
                char next=prev.charAt(i+1);

                if(cur==next) key++;
                else{
                    nuova+=key;
                    nuova+=cur;
                    key=1;
                }

            }
            seq.add(Long.parseLong(nuova));
            n--;
            contatore++;
        }

        return seq;
    }
}
