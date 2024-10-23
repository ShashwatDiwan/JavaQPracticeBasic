package QuestionBank_24;

import java.util.Scanner;

public class isPrime {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }
        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for an integer
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers up to " + n + ":");

        // Loop through all numbers up to n and check for primes
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
