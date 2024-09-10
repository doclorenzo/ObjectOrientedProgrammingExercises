package esercizi_thread;

public class StartStop extends Thread{

        @Override
        public void run() {

            System.out.println(getName()+" started");
            long start=System.nanoTime();

            while(!interrupted()){
                Long now=System.nanoTime()-start;
                System.out.println(getName() + " running since: "+now.toString()+"ms");
            }
            System.out.println(getName()+" Terminated");
        }
}
