package Java.Collection.List;
import java.util.*;

public class VectorMethods {
    public static void main(String[] args){
        Vector vr = new Vector<>(10);

        vr.addElement(10);
        vr.addElement(20);
        vr.addElement(30);
        vr.addElement(40);
        vr.addElement(50);

        vr.trimToSize();


        System.out.println(vr);
        System.out.println(vr.capacity());

        vr.setElementAt("Sam", 2);
        System.out.println(vr);

    //     vr.firstElement();
    //     System.out.println(vr);
    //     vr.lastElement();
    //     System.out.println(vr);
         
        vr.insertElementAt("Shubhangi", 1);
        System.out.println(vr);

        System.out.println(vr.size());
    }
    
}
