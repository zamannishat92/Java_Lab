package Assignment_4;

import java.util.ArrayList;

public class Consumer2 implements Runnable {

    private ArrayList<Integer> q2;

    public Consumer2(ArrayList<Integer> q2) {
        this.q2 = q2;
    }

    @Override
    public void run() {
        while(true){
            synchronized (q2) {
                if(q2.size() != 0){
                    for(int i=0; i<10; i++){
                        q2.remove(0);
                        System.out.println("Consumer take"+" "+(i+1)+"cake from queue 3");
                    }
                    System.out.println("Queue 3 is empty");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    q2.notify();

                }
                else{
                    try {
                        q2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }


    }

}

