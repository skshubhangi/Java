package Java.Array.Array3;
import java.util.*;

class code7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements are:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            if(size%2==1 && size>=5){
                if(arr[i]%2==1){
                    System.out.print(arr[i]+" ");
                }
            }else{
                if(arr[i]%2==0){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    
}
