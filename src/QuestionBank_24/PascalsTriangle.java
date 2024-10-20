package QuestionBank_24;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows :");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int i = 0; i < rows ; i++){
            int num = 1;
            for(int spaces = 0; spaces < rows - i; spaces++){
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++){
                System.out.print(num+" ");
                num = num * (i-k)/(k+1);
            }
            System.out.println();

        }
    }
}
