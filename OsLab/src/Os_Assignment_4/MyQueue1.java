package Os_Assignment_4;

import java.util.concurrent.Semaphore;

public class MyQueue1 {

    private int item;

    private  Semaphore semaphoreConsumer = new Semaphore(0);
    private Semaphore semaphoreProducer = new Semaphore(1);

    public void get() {
        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        System.out.println("Consumer1 consumed chocolate cake : " + item);

        semaphoreProducer.release();
    }

    public void put(int item) {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        this.item = item;
        System.out.println("Chef's z decorate chocolate cake : " + item);

        semaphoreConsumer.release();
    }
}

