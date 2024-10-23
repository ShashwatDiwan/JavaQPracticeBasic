/*Write a Java program to manage and analyze an array of integers.
The application should allow the user to specify the number of elements, input integer values,
 and display the array in a user-friendly format. It should compute the sum and average of the array,
 determine the largest and smallest numbers, and provide search functionality to find a specific integer and its index.*/
package QuestionBank_24;
import java.util.*;

public class ArrayManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements are there in array :");
        int numElements = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[numElements];
        System.out.println("Now add array elements :");

        for (int i = 0; i < numElements; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Your array --> "+Arrays.toString(arr));
        int sum =0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println("Sum of all array elements = "+ sum);
        double avg = (double)sum/(double)numElements;
        System.out.println("Average of array = "+ avg);

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        System.out.print("Enter the element you want to search :");
        int searchElement = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == searchElement) {
                System.out.println("Element " + searchElement + " found at index " + i);
                found = true;
            }
        }
        if(!found)
            System.out.println("Element" + searchElement + " not found at index.");
    }
}
