package Os_Assignment_4;

public class Consumer implements Runnable {
    private MyQueue myQueue;
    private MyQueue1 myQueue1;
    private MyQueue2 myQueue2;

    public Consumer(MyQueue myQueue,MyQueue1 myQueue1,MyQueue2 myQueue2) {
        this.myQueue = myQueue;
        this.myQueue1=myQueue1;
        this.myQueue2=myQueue2;
    }

    public void run() {
        while (true) {
            // consumer get items
            int x=myQueue.get();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myQueue1.put(x);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myQueue2.put(x);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
