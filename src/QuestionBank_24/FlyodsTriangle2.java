package QuestionBank_24;

import java.util.Scanner;

public class FlyodsTriangle2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int num = 1;
        for(int i =0; i < rows; i++){
            for(int spaces =0; spaces < rows-i; spaces++){
                System.out.print(" ");
            }

            for(int k=0; k<=i ; k++){
                System.out.print(num+" ");
            }
            System.out.println();
            num++;
        }
    }
}
