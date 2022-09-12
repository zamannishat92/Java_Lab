package Os_Assignment_4;

public class Consumer2 implements Runnable {
    private MyQueue2 myQueue2;

    public Consumer2(MyQueue2 myQueue2) {
        this.myQueue2=myQueue2;
    }

    public void run() {
        while (true) {
            // consumer get items
            myQueue2.get();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}