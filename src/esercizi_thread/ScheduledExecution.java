package esercizi_thread;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecution {

    public static void main(String[] args) {

        ScheduledExecutorService executor= Executors.newSingleThreadScheduledExecutor();
        executor.scheduleAtFixedRate(()-> System.out.println(LocalDateTime.now().getHour()+":"+LocalDateTime.now().getMinute()+":"+LocalDateTime.now().getSecond()+" Hello!"), 0,1, TimeUnit.SECONDS);
    }

}
