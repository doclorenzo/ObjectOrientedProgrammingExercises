package esercizi_thread;

import java.time.LocalDate;

public class DayChangeCheck extends Thread {

    @Override
    public void run() {

        int today=LocalDate.now().getDayOfMonth();
         while(!interrupted()){
             try {
                 Thread.sleep(60*100*15);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             if(LocalDate.now().getDayOfMonth()!=today){
                 System.out.println("It Changed!");
                 today=LocalDate.now().getDayOfMonth();
             }
         }

    }
}
