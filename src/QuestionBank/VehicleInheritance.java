/*Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and
 a method showData ( ) to show “This is a vehicle class”.
 Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber in Bus and
 manufacturerName in Car and both of them having showData ( ) method showing all details of Bus and
 Car respectively with content of the super class’s showData ( ) method.*/
package QuestionBank;

class Vehicles{
    protected  String regnNumber;
    protected  double speed;
    protected  String color;
    protected String ownerName;

    Vehicles(String regnNumber,double speed,String color,String ownerName){
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData(){
        System.out.println("This is a Vehicle class");
    }
}

class Bus extends Vehicles{
    private int routeNumber;

    Bus(String regnNumber,double speed,String color,String ownerName,int routeNumber){
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }
    @Override
    public void showData(){
        System.out.println("Bus Details :");
        super.showData(); // Call to Vehicle's showData
        System.out.println("Bus Registration Number: " + regnNumber);
        System.out.println("Bus Speed: " + speed + " km/h");
        System.out.println("Bus Color: " + color);
        System.out.println("Bus Owner Name: " + ownerName);
        System.out.println("Bus Route Number: " + routeNumber);
    }
}

class Cars extends Vehicles{
    private String manufacturerName;

    Cars(String regnNumber,double speed,String color,String ownerName,String manufacturerName){
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }
    @Override
    public void showData(){
        // Call to Vehicle's showData
        System.out.println("Car Registration Number: " + regnNumber);
        System.out.println("Car Speed: " + speed + " km/h");
        System.out.println("Car Color: " + color);
        System.out.println("Car Owner Name: " + ownerName);
        System.out.println("Car Manufacturer Name: " + manufacturerName);
    }
}

public class VehicleInheritance {
    public static void main(String[] args) {
        Vehicles bus = new Bus("BUS100",45.2,"Red","Shashank",15);
        bus.showData();

        Vehicles car = new Cars("CAR200",56.2,"Yellow","Shashwat","BMW");
        car.showData();
    }
}
