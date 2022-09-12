package Os_Assignment_4;

public class Consumer1 implements Runnable {
    private MyQueue1 myQueue1;

    public Consumer1(MyQueue1 myQueue1) {
        this.myQueue1=myQueue1;
    }

    public void run() {
        while (true) {
            // consumer get items
            myQueue1.get();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
