package esercizi_thread;

import java.util.Random;

public class ThreadPool extends Thread{

    private Integer task;
    private Integer num;

    public ThreadPool(int task) {
        this.task = task;
        Random rand=new Random();
        this.num=rand.nextInt(10000);
    }


    @Override
    public void run() {

        System.out.println("START thread="+getName()+" task="+this.task.toString());

        try {
            Thread.sleep(this.num);
        } catch (InterruptedException ignore) {

        }

        System.out.println("STOP thread="+getName()+" task="+this.task.toString()+" t="+this.num.toString()+" ms");

    }
}
