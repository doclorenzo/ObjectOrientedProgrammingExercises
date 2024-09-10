package esercizi_oop.reverse;

public class RemoveSlow implements Reverser{


    @Override
    public String reverse(String s) {
        String ret = "";
        for(int i=s.length()-1; i>=0 ; i--){
            ret+=s.charAt(i);
        }
        return ret;
    }
}
