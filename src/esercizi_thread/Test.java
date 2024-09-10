package esercizi_thread;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Queue<Integer> q=new PriorityQueue<Integer>();
        ProducerConsumerSafe.Producer p =new ProducerConsumerSafe.Producer(q);
        ProducerConsumerSafe.Consumer c =new ProducerConsumerSafe.Consumer(q);

        p.start();
        c.start();

        Thread.sleep(100);

        p.interrupt();
        c.interrupt();

    }

}
