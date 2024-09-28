package Java_Basics;

import java.util.Scanner;

public class LargerofTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers :");

        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        if(num_1>num_2)
            System.out.println("The larger of two numbers is :"+num_1);

        else
            System.out.println("The larger of two numbers is :"+num_2);


    }
}
