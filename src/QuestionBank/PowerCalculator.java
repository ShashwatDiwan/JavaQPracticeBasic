/* You are required to compute the power of a number by implementing a calculator.
Create a class MyCalculator which consists of a single method long power (int, int).
This method takes two integers n and p, as parameters and finds (n)p. If either or is negative,
then the method must throw an exception which says " n or p should not be negative”.
Also, if both and are zero, then the method must throw an exception which says "n or p should not be negative”. */

package QuestionBank;

import java.util.Scanner;

class MyCalculator{
    long power(int n,int p) throws Exception{
        long product = 1;

        if(n<0 || p<0)
           throw new Exception("Both n or p cannot be Negative");


        else if (n==0 && p==0)
            throw new Exception("Both n and p cannot be zero");

        else
            System.out.println("Valid Input...");


        return product;
    }
}

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter base (n) : ");
        int n = sc.nextInt();

        System.out.println("Please enter the power (p) : ");
        int p = sc.nextInt();

        MyCalculator calculate = new MyCalculator();

        try {
            // Calculate and display the result
            System.out.println("SOLUTION: " + calculate.power(n, p));
        } catch (Exception e) {
            // Display any exception message
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
