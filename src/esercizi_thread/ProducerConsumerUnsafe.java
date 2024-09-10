package esercizi_thread;

import java.util.Deque;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProducerConsumerUnsafe {

    public static void main(String[] args) throws InterruptedException {
        Deque<Integer> q=new ConcurrentLinkedDeque<Integer>();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.start();
        c.start();

        Thread.sleep(100);

        p.interrupt();
        c.interrupt();

    }

    static class Producer extends Thread{

        Deque<Integer> q;

        public Producer(Deque<Integer> q) {
            this.q = q;
        }

        @Override
        public void run() {

            Random rand=new Random();
            while(!interrupted()){
                q.add(rand.nextInt(10));
            }
        }
    }

    static class Consumer extends Thread{

        Deque<Integer> q;

        public Consumer(Deque<Integer> q){
            this.q=q;
        }

        @Override
        public void run() {
            int c=0;
            while(!interrupted()){
                try{
                    q.poll();
                    c++;
                }
                catch(Exception e){
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements: "+c);
        }
    }

}
