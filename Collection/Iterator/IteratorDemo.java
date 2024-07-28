package Java.Collection.Iterator;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args){
        Stack s = new Stack<>();

        s.push(10);
        s.push("Sam");
        s.push(30);
        s.push(40);
        s.push(50);

        Iterator cursor = s.iterator();
        while(cursor.hasNext()){
            if("Sam"==cursor.next())
            cursor.remove();
        }
        System.out.println(s);
    }
    
}
