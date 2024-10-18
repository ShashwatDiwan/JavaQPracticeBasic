/*Create a class called Time, which has three private instance variables – hour, min and sec.
It contains a method called add( ) which takes one Time object as parameter and
prints the added value of the calling Time object and passes the Time object.
In the main method, declare two Time objects and assign values using the constructor and call the add() method.*/

package QuestionBank;

class Time{
    private int hour;
    private int min;
    private int sec;

    Time(int hour,int min,int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    Time add(Time t2){
        int newSec= this.sec + t2.sec;
            int carryMin = newSec/60;
            newSec = newSec%60;

        int newMin = this.min + t2.min + carryMin;
        int carryHour = newMin/60;
        newMin = newMin%60;

        int newHour = this.hour + t2.hour + carryHour;
        return new Time(newHour,newMin,newSec);
    }

    void display(){
        System.out.println(this.hour + "h:" + this.min + "m:" + this.sec + "s");
    }
}

public class TimeManager {
    public static void main(String[] args) {
        Time t1 = new Time(4,12,16);
        Time t2 = new Time(1,0,0);

        Time result = t1.add(t2);
        result.display();
    }
}
