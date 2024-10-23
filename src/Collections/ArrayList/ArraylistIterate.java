/*Write a Java Program to iterate ArrayList using for-loop, iterator,
 and advance for-loop. Insert 3 Array List.Input 20 30 40*/

package Collections.ArrayList;
import java.util.*;

public class ArraylistIterate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(20);
        list.add(30);
        list.add(40);

        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int i : list){
            System.out.println(i);
        }


    }
}
