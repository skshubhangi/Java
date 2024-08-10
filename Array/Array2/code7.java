package Java.Array.Array2;
import java.util.Scanner;

class code7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter array Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            if(size%2==0){
                System.out.println(arr[i]+" ");
                i++;
            }else{
                System.out.println(arr[i]+" ");
            }
        }
    }    
}
