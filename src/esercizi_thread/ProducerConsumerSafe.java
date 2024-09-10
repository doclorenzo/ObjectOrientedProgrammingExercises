package esercizi_thread;

import esercizi_collections.List.CollatzSequence;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerSafe {


    public static class Producer extends Thread{

        private Queue<Integer> q;

        public Producer(Queue<Integer> q) {
            this.q = q;
        }

        @Override
        public void run() {
            Random rand=new Random();
            while(!interrupted()){
                synchronized (q) {
                    q.add(rand.nextInt(10));
                }
            }
        }
    }

    public static class Consumer extends Thread{

        private Queue<Integer> q;

        public Consumer(Queue<Integer> q) {
            this.q = q;
        }

        @Override
        public void run() {
            int c=0;
            while(!interrupted()){
                try {
                    synchronized (q) {
                        q.poll();
                        c++;
                    }
                }
                catch(Exception e){
                    Thread.yield();
                }
            }
            System.out.println("Total number of consumed elements: "+ c);
        }
    }
}
