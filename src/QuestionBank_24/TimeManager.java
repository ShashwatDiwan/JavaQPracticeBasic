package QuestionBank_24;

class Time{
    private int hour;
    private int min;
    private int sec;

    Time(int hour,int min,int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public Time add(Time t2){
        int newSec = this.sec + t2.sec;
        int carrySec = newSec/60;
        newSec = newSec%60;

        int newMin = this.min + t2.min + carrySec;
        int carryMin = newMin/60;
        newMin = newMin%60;

        int newHour = this.hour+t2.hour+ carryMin;
        return new Time(newHour,newMin,newSec);

    }

    public void display(){
        System.out.println("["+this.hour+"h:"+this.min+"m:"+this.sec+"s]");
    }
}

public class TimeManager {
    public static void main(String[] args) {
        Time t1 = new Time(5,0,0);
        Time t2 = new Time(6,10,10);

        Time t3 = t1.add(t2);
        t3.display();
    }
}
