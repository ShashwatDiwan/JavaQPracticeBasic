package Collections.Iterator;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("S");
        list.add("H");
        list.add("A");
        list.add("S");
        list.add("H");
        list.add("U");

        //Write a Java program to iterate through all elements in an array list.
        ListIterator<String> litr = list.listIterator();
        while(litr.hasNext()){
           String element = litr.next();
            System.out.print(element);
      }


        //Write a Java program to insert an element into the array list at the first position.
        list.add(0,"R");
        System.out.println(list);
        System.out.println(list.get(0));

        //sort Arraylist
       Collections.sort(list);
        System.out.println(list);

        //extract sublist
        List<String> sublist = list.subList(0,3);
        System.out.println(sublist);


    }
}
