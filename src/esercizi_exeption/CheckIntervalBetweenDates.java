package esercizi_exeption;

import java.time.LocalDate;

public class CheckIntervalBetweenDates  {

    public static boolean checkIntervalBetweenDates(String begin, String end){

        LocalDate b = LocalDate.parse(begin);
        LocalDate e = LocalDate.parse(end);
        return b.isBefore(e);
    }

}
