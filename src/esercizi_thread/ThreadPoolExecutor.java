package esercizi_thread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {

    public static void main(String[] args) {

        Random rand=new Random();
        int n_tasks=rand.nextInt(10);
        int n_threads=n_tasks/2;

        ExecutorService executor= Executors.newFixedThreadPool(4);
        for(int i=0; i<8; i++){
            int tn=i;
            executor.submit(()->{
                Random r=new Random();
                int num=r.nextInt(10000);
                System.out.println("START thread="+Thread.currentThread().getName()+" task="+ Integer.toString(tn));
                        try {
                            Thread.sleep(num);
                        } catch (InterruptedException ignore) {
                        }
                System.out.println("STOP thread"+Thread.currentThread().getName()+" task="+ Integer.toString(tn) +" t="+ Integer.toString(num));
            }
            );
        }
    executor.shutdown();
    }

}
