package Java.Array.Array4;
import java.util.*;

class code4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to check:");
        int num = sc.nextInt();
        int count=0;
        for(int i=0;i<size;i++){
            if(num==arr[i]){
                count++;
            }
            if(count>2){
                System.out.println(arr[i]+" occurs more than 2 times in the array");
            }
        }
        
    }
    
}
