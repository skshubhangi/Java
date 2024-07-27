package Java.Collection.List;
import java.util.*;

class ArrayListMethods extends ArrayList {
    public static void main(String[] args){
        ArrayListMethods al = new ArrayListMethods();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

        System.out.println(al.indexOf(30));

        al.trimToSize();

        ArrayListMethods al1 = new ArrayListMethods();
        al1.add("Samruddhi");
        al1.add("Samruddhi");
        al1.add("Samruddhi");

        al.addAll(al1);
        System.out.println(al);

        al.removeRange(3,7);
        System.out.println(al);

        al.removeAll(al1);
        System.out.println(al);
    }
    
}
