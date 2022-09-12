package Assignment_4;

import java.util.ArrayList;

public class Consumer1 implements Runnable {

    private ArrayList<Integer> q1;

    public Consumer1(ArrayList<Integer> q1) {
        this.q1 = q1;
    }

    @Override
    public void run() {
        while(true){
            synchronized (q1) {
                if(q1.size() != 0){
                    for(int i=0; i<10; i++){
                        q1.remove(0);
                        System.out.println("Consumer take"+" "+(i+1)+"cake from queue 2");
                    }
                    System.out.println("Queue 2 is empty");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    q1.notify();

                }
                else{
                    try {
                        q1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }


    }

}

