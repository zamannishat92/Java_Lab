package Assignment_4;

import java.util.ArrayList;

public class ProducerConsumerDriver {
            public static void main(String[] args) {
            ArrayList<Integer> q = new ArrayList<Integer>();
            ArrayList<Integer> q1 = new ArrayList<Integer>();
            ArrayList<Integer> q2 = new ArrayList<Integer>();

            Producer p = new Producer(q);
            Consumer c = new Consumer(q,q1,q2);
            Consumer1 c1=new Consumer1(q1);
            Consumer2 c2=new Consumer2(q2);
            Thread procucerThread = new Thread(p);
            Thread consumerThread = new Thread(c);
            Thread consumerThread1 = new Thread(c1);
            Thread consumerThread2 = new Thread(c2);
            procucerThread.start();
            consumerThread.start();
            consumerThread1.start();
            consumerThread2.start();
        }

    }

