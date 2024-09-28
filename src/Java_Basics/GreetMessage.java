//Take name as input and print a greeting message for that particular name.
package Java_Basics;

import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your Good name : ");
        String name = sc.nextLine();

        System.out.println("Hey "+name+"! Wish you a wonderful day ahead.");
    }
}
