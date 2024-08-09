package Java.Array.Array3;
import java.util.Scanner;

class code1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            arr[i]+=15;
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    
}
