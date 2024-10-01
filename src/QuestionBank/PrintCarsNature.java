/*A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand.
 Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle.
 For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track.
 Write a program that accepts input from the user on the kind of vehicle the user wants to order,
 and the system should print out nature of movement.
 Implement all Java coding best practices to implement this program.*/

package QuestionBank;

import java.util.Scanner;

interface Vehicle{
    void move();
}

class Helicopter implements Vehicle{
    @Override
    public void move(){
        System.out.println("The Helicopter flies in the air");
    }
}

class Car implements Vehicle{
    @Override
    public void move(){
        System.out.println("The Car drives on the road");
    }
}


class Train implements Vehicle{
    @Override
    public void move(){
        System.out.println("The train runs on the track");
    }
}


public class PrintCarsNature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the kind of vehicle you wanna order (Helicopter,Car or Train) :");
        String UserInput = sc.nextLine();

        Helicopter hc = new Helicopter();
        Car ca = new Car();
        Train tr = new Train();

        if(UserInput.equalsIgnoreCase("Helicopter")){
            hc.move();
        }

        else if(UserInput.equalsIgnoreCase("Car")){
            ca.move();
        }

        else if(UserInput.equalsIgnoreCase("Train")){
            tr.move();
        }

        else {
            System.out.println("Invalid input. Please choose Helicopter, Car, or Train.");
        }


    }
}
