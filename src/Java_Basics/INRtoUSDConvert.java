package Java_Basics;

import java.util.Scanner;

public class INRtoUSDConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Currency in INR :");
        double currency_inr = sc.nextFloat();

        double currency_usd = currency_inr/83.72;
        System.out.println("Currency in USD is :"+currency_usd);


    }
}
