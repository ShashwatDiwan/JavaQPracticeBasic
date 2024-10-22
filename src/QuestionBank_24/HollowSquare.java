package QuestionBank_24;
import java.util.Scanner;
public class HollowSquare{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of hollow square :");
        int size = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size ; j++){
                if(i==1 || i==size || j==1 || j==size){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}


//import java.util.Scanner;

//public class HollowSquare {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Ask the user to enter the size of the square
//        System.out.print("Enter the size of the square: ");
//        int size = sc.nextInt();
//
//        // Print the hollow square
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                // Print '*' at the borders (first and last row or first and last column)
//                if (i == 1 || i == size || j == 1 || j == size) {
//                    System.out.print("* ");
//                } else {
//                    // Print space for the hollow area
//                    System.out.print("  ");
//                }
//            }
//            // Move to the next line after each row
//            System.out.println();
//        }
//
//        sc.close();
//    }
//}
