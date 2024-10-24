/*Write a Java program to remove prime numbers between 1 to 25 from ArrayList using an iterator.*/
package Collections.Iterator;
import java.util.*;

public class PrimeNumWithIterator {

    public static boolean isPrime(int n){
        if(n==0) return false;
        if(n==1) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=1;i<26;i++){
            list.add(i);
        }

        Iterator <Integer> itr = list.iterator();
        while(itr.hasNext()){
            int n = itr.next();
            if(isPrime(n))
                System.out.print(n + " ");
        }
    }

}
