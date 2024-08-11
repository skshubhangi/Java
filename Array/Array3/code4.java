package Java.Array.Array3;
import java.util.*;

class code4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Specific number:");
        int num = sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
           if(arr[i]==num){
            count++;
           }
        }
        if(count>0){
            System.out.println("Number "+num+" occurred "+count+" times in an array");
        }else if(count==0){
            System.out.println("num "+num+" is not found in array");
        }
    }
    
}
