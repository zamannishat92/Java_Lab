package Assignment_4;

import java.util.ArrayList;

public class Consumer implements Runnable {

    private ArrayList<Integer> q;
    private ArrayList<Integer> q1;
    private ArrayList<Integer> q2;

    public Consumer(ArrayList<Integer> q,ArrayList<Integer> q1,ArrayList<Integer> q2) {
        this.q = q;
        this.q1=q1;
        this.q2=q2;
    }

    @Override
    public void run() {
        while(true){
            synchronized (q) {
                if(q.size() != 0){
                    for(int i=0; i<5; i++){
                        q.remove(0);
                        System.out.println("Consumer 1 decorate cake"+" "+(i+1));
                    }
                    System.out.println("Queue1 is empty");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    q.notify();

                }
                else{
                    try {
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            synchronized (q1){
                if(q1.size() != 0){
                    try {
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    for(int i=0;i<5;i++){
                        q1.add(i);
                        System.out.println("Decorater add"+" "+(i+1)+"cake to the queue 2");
                    }
                    System.out.println("Queue 2 is full");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    q1.notify();
                }

            }
            synchronized (q2){
                if(q2.size() != 0){
                    try {
                        q2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    for(int i=0;i<5;i++){
                        q2.add(i);
                        System.out.println("Decorater add"+" "+(i+1)+"cake to the queue 3");
                    }
                    System.out.println("Queue 3 is full");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    q2.notify();
                }

            }
        }


    }

}
