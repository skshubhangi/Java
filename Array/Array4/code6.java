package Java.Array.Array4;
import java.util.*;

class code5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reversed Array:");
        int arr1[] = new int[size];
        for(int i=0;i<size;i++){
            arr1[i]=arr[size-(i+1)];
            System.out.println(arr1[i]);
        }
    }
    
}

