package Java.Array.Array3;
import java.util.*;

class code5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array element are:");
        for(int i=0;i<size;i++){
            if(arr[i]<0){
                System.out.print(arr[i]*arr[i]+" ");
            }else{
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}