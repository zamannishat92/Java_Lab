package OsOnline;

import java.util.Comparator;

public class Process {
    String ProName;
    int duration;
    int arrtime;

    Process(String ProName, int duration, int arrtime) {
        this.ProName = ProName;
        this.duration = duration;
        this.arrtime = arrtime;
    }
    public static class  DurSort implements Comparator<Process>{

        @Override
        public int compare(Process process, Process t1) {
            return process.duration - t1.duration;
        }
    }
    public static class  ArrSort implements Comparator<Process>{

        @Override
        public int compare(Process process, Process t1) {
            return process.arrtime - t1.arrtime;
        }
    }
}