package esercizi_oop.reverse;

public class RemoveFast implements Reverser{

    @Override
    public String reverse(String s) {
        StringBuilder ret=new StringBuilder(s);
        return ret.reverse().toString();
    }
}
