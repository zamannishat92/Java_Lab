package Assignment_4;
    import java.util.ArrayList;

    public class Producer implements Runnable {

        private ArrayList<Integer> q;

        public Producer(ArrayList<Integer> q) {
            this.q = q;
        }

        @Override
        public void run() {
            while(true){
                synchronized (q) {
                    if(q.size() != 0){
                        try {
                            q.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else{
                        for(int i=0;i<5;i++){
                            q.add(i);
                            System.out.println("Producer add"+" "+(i+1)+"cake to the queue 1");
                        }
                        System.out.println("Queue 1 is full");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        q.notify();
                    }

                }
            }

        }

    }


