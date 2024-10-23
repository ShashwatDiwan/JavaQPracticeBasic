package QuestionBank_24;
import java.util.*;

public class NthFibonacci {

    private static int Recursive(int n){
        if(n==0) return 0; if(n==1) return 1;
        else return Recursive(n-1) + Recursive(n-2);
    }

    private static int nonRecursive(int n){

        if(n==0) return 0; if(n==1) return 1;
        int prev1 = 0; int prev2 = 1;
        int current = 0;

        for(int i =2; i<=n;i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Fibonacci(Non-Recursive) "+n+"th term is : "+nonRecursive(n));
        System.out.println("Fibonacci(Recursive) "+n+"th term is : "+Recursive(n));
    }
}
