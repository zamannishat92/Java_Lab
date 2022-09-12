package Os_Assignment_4;

import java.util.concurrent.Semaphore;

public class MyQueue {

    private int item;

    private  Semaphore semaphoreConsumer = new Semaphore(0);
    private Semaphore semaphoreProducer = new Semaphore(1);

    public int get() {
        try {
            semaphoreConsumer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        System.out.println("Chefs z consumed item : " + item);

        semaphoreProducer.release();
        return item;
    }

    public void put(int item) {
        try {
            semaphoreProducer.acquire();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }

        this.item = item;
        System.out.println("Producer produced item : " + item);

        semaphoreConsumer.release();
    }
}

