package Java.Collection.List;
import java.util.*;

import org.omg.CORBA.SystemException;

public class LinkedListMethods {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println(ll);

        ll.addFirst("Samruddhi");
        System.out.println(ll);

        ll.addLast("Shubhangi");
        System.out.println(ll);

        //Offer(Object o)
        //return value - boolean,add object in List
        //System.out.println(ll.offer("Sam"));
        //System.out.println(ll.offerFirst("Shubhangi"));

        //Contains 
        //return vlaue - boolean
        System.out.println(ll.contains("Sahlini"));
       
        //size return_value: int
        System.out.println(ll.size());

        //peek only return object ,not remove from list
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.peekLast());

        //poll return and remove object 
        System.out.println(ll.poll());
        System.out.println(ll);
        System.out.println(ll.pollLast());
        System.out.println(ll);

        //push add element at first
        ll.push("Shalini");
        System.out.println(ll);
        //pop remove first element 
        ll.pop();
        System.out.println(ll);
        
        //removeFirstOccurence return value: boolean and remove the first occurred element
        System.out.println(ll.removeFirstOccurrence(10));
        System.out.println(ll);
 
        //removeLastOccurrence
        System.out.println(ll.removeLastOccurrence(50));
        System.out.println(ll);
    
    }    
}
