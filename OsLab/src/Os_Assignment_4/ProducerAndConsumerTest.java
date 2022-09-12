package Os_Assignment_4;

public class ProducerAndConsumerTest {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        MyQueue1 myQueue1 = new MyQueue1();
        MyQueue2 myQueue2 = new MyQueue2();

        Producer producer = new Producer(myQueue);
        Producer1 producer1=new Producer1(myQueue);
        Consumer consumer = new Consumer(myQueue,myQueue1,myQueue2);
        Consumer1 consumer1=new Consumer1(myQueue1);
        Consumer2 consumer2=new Consumer2(myQueue2);

        Thread producerThread = new Thread(producer);
        producerThread.start();

        Thread producerThread1 = new Thread(producer1);
        producerThread1.start();

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        Thread consumerThread1 = new Thread(consumer1);
        consumerThread1.start();

        Thread consumerThread2 = new Thread(consumer2);
        consumerThread2.start();
    }

}

