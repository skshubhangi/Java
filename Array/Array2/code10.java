package Java.Array.Array2;
import java.util.Scanner;

class code10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int pos =0;
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
                pos=i;
            }
        }
        System.out.println("Maximum number in the array is found at position "+pos+" is "+max);
    }
    
}
