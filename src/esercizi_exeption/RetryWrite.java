package esercizi_exeption;

import java.io.IOException;
import java.util.random.RandomGenerator;

public class RetryWrite {
    private static final RandomGenerator RND = RandomGenerator.getDefault();

    public static void main(String[] args) {
        try {
            writeWithTries(1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Calls the write() method. If it fails, retries the call maxTries times
     * @param maxTries the maximum number of retries
     */
    public static void writeWithTries(int maxTries) {

        int cont=0;
        for(int i=0; i<maxTries; i++){
            try{
                write("c");
            } catch (IOException e) {
                cont++;
            }
        }
        if(cont==maxTries)
            throw new RuntimeException("All the "+String.valueOf(maxTries)+" calls to the method wirte() failed");

    }

    /**
     * Simulates a write with 66% probability of failing
     *
     * @param message the message to write
     * @throws IOException when write fails
     */
    public static void write(String message) throws IOException {
        if (RND.nextDouble() < 0.66) {
            throw new IOException("Unable to send: " + message);
        }
    }
}