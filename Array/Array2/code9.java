package Java.Array.Array2;
import java.util.Scanner;

class code9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Minimum number in the array is: "+min);
    }
    
}
