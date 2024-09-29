//Write a Java program to create an interface Flyable with a method called fly_obj().
// Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
// Implement the fly_obj() method for each of the three classes...
package Interfaces;

interface Flyable{
    void fly_obj();
}

class Spacecraft implements Flyable{
    @Override
    public void fly_obj(){
        System.out.println("Spacecraft is flying");
    }
}

class  Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}

class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}
public class Flyables {
    public static void main(String[] args) {
        Spacecraft sp = new Spacecraft();
        Airplane ap = new Airplane();
        Helicopter hp = new Helicopter();

        sp.fly_obj();
        ap.fly_obj();
        hp.fly_obj();
    }
}
