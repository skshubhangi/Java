
package Java.Array.Array4;
import java.util.*;

class code3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The difference between the minimum amd maximum element is:"+(max-min));
    }
    
}
