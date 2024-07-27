package Java.Collection.List;
import java.util.*;

class ListMethods {
    public static void main(String[] args){
        List al = new ArrayList();

        al.add(10);
        al.add("Shubhangi");
        al.add("Samruddhi");
        al.add(30.5);
        al.add(20.5f);

        System.out.println(al);

        al.add(3,"Shalini");
        al.add(5,"kalyani");
        System.out.println(al);

        System.out.println(al.contains(30));

        System.out.println(al.get(2));

        System.out.println(al.isEmpty());

        System.out.println(al.remove(1));
        System.out.println(al);

        System.out.println(al.remove(20.5f));
        System.out.println(al);

        al.set(2,"SAM");
        System.out.println(al);

        System.out.println(al.size());

        al.clear();
        System.out.println(al);
    }
    
}
