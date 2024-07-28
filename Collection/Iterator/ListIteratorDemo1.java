package Java.Collection.Iterator;
import java.util.*;

public class ListIteratorDemo1 {
    public static void main(String[] args){
        Stack s = new Stack();

        s.push("Sam");
        s.push("Omii");
        s.push("Sauu");
        s.push("Krishuu");
        s.push("Shubhangi");

        ListIterator cursor = s.listIterator();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
        while(cursor.hasPrevious()){
            System.out.println(cursor.previous());
        }
    }
    
}

