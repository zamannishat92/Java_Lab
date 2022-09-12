package Os_Assignment_4;

import java.util.Random;

public class Producer1 implements Runnable {
    private MyQueue myQueue;

    public Producer1(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        while (true) {
            Random random = new Random();
            int data = random.nextInt(100);
            // producer put items
            myQueue.put(data);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

