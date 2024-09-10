package esercizi_exeption;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {

    public static boolean checkIntervalBetweenDatesAlt(String begin, String end){
        try{
            LocalDate b = LocalDate.parse(begin);
            LocalDate e = LocalDate.parse(end);
            return b.isBefore(e);
        }
        catch(DateTimeParseException e){
            return false;
        }
    }
}
