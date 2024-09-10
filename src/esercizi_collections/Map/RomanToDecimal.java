package esercizi_collections.Map;

import java.util.HashMap;

public class RomanToDecimal {

    public static int romanToDecimal(String s){
        HashMap<Character,Integer> romaniBase = new HashMap<Character,Integer>();
        HashMap<String,Integer> romaniAvanzati = new HashMap<String,Integer>();

        romaniBase.put('I',1);
        romaniBase.put('V',5);
        romaniBase.put('X',10);
        romaniBase.put('L',50);
        romaniBase.put('C',100);
        romaniBase.put('D',500);
        romaniBase.put('M',1000);

        romaniAvanzati.put("IV",4);
        romaniAvanzati.put("IX",9);
        romaniAvanzati.put("XL",40);
        romaniAvanzati.put("XC",90);
        romaniAvanzati.put("CD",400);
        romaniAvanzati.put("CM",900);

        int ret=0;

        for(int i=0; i<s.length(); i++){
            if(i<s.length()-1){
                StringBuilder test=new StringBuilder();
                test.append(s.charAt(i));
                test.append(s.charAt(i+1));
                if(romaniAvanzati.containsKey(test.toString())){
                    ret+=romaniAvanzati.get(test.toString());
                    i++;
                }
                else ret+=romaniBase.get(s.charAt(i));
            }
            else ret+=romaniBase.get(s.charAt(i));
        }
    return ret;
    }

}
