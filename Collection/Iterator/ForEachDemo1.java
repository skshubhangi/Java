package Java.Collection.Iterator;
import java.util.*;

public class ForEachDemo1 {
    public static void main(String[] args){
        ArrayList<Object> al = new ArrayList<Object>();
        al.add(10);
        al.add(20);
        al.add("Shubhangi");
        System.out.println(al);

        for(Object x : al){
            System.out.println(x);
        }
    }
    
}
