package esercizi_exeption;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static esercizi_exeption.CheckString.checkString;

public class FilterItems {

    public static List<String> filterItems(List<String> strings){

        List<String> ret=new ArrayList<String>();
        for(String s : strings){
            try{
                checkString(s);
            }
            catch (ParseException e){
                continue;
            }
            ret.add(s);
        }
    return ret;
    }

}
