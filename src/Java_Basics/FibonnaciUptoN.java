//To calculate Fibonacci Series up to n numbers.
package Java_Basics;

import java.util.Scanner;

public class FibonnaciUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;

        System.out.println("Enter n :");
        int n = sc.nextInt();

        System.out.print("Fibonacci series upto "+n+" is : "+"["+ n1 +" "+ n2);

        for(int i=0;i<= n;i++){
            int n3 = n1+ n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("]");
    }
}
