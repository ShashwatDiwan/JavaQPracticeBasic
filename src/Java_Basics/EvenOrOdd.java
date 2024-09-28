//Write a program to print whether a number is even or odd, also take input from the user.
package Java_Basics;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even");
        }

        else {
            System.out.println("Number is Odd");
        }
    }
}
