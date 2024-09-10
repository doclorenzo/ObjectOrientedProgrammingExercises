package esercizi_collections.Map;

import java.util.HashMap;

public class MorseCode {

    public static String morseCode(String string){
        HashMap<Character,String> morse = new HashMap<Character,String>();
        morse.put('A',"._");
        morse.put('B',"_...");
        morse.put('C',"_._.");
        morse.put('D',"_..");
        morse.put('E',".");
        morse.put('F',".._.");
        morse.put('G',"__.");
        morse.put('H',"....");
        morse.put('I',"..");
        morse.put('J',".___");
        morse.put('K',"_._");
        morse.put('L',"._..");
        morse.put('M',"__");
        morse.put('N',"_.");
        morse.put('O',"___");
        morse.put('P',".__.");
        morse.put('Q',"__._");
        morse.put('R',"._.");
        morse.put('S',"...");
        morse.put('T',"_");
        morse.put('U',".._");
        morse.put('V',"..._");
        morse.put('W',".__");
        morse.put('X',"_.._");
        morse.put('Y',"_.__");
        morse.put('Z',"__..");

        StringBuilder ret=new StringBuilder();
        string=string.toUpperCase();
        for(Character c:string.toCharArray()){
            if(morse.containsKey(c)) {ret.append(morse.get(c)); ret.append(' ');}
            else throw new IllegalArgumentException();
        }
        return ret.toString();
    }

}
