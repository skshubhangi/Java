package Java.Collection.List;
import java.util.*;

public class StackMethods {
    public static void main(String[] args){
        Stack s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.println(s);
        
        //peek return top element only
        System.out.println(s.peek());
        System.out.println(s);

        //pop return top element and remove it
        System.out.println(s.pop());
        System.out.println(s);

        //search from top element of stack it get index from one not zero because it is not connected to ground
        //hence top element contain index value 1 
        System.out.println(s.search(30));   //2

    }
    
}
