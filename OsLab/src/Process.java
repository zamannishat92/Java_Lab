
public class Process implements Comparable {
    int proscessID;
    String ProName;
    int duration;
    int arrtime;

    Process(int proscessID, String ProName, int duration, int arrtime) {
        this.proscessID = proscessID;
        this.ProName = ProName;
        this.duration = duration;
        this.arrtime = arrtime;
    }

    @Override
    public int compareTo(Object p) {
        int value=((Process)p).arrtime;
        return this.arrtime - value;
    }


}


