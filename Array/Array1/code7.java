package Java.Array.Array1;
import java.util.Scanner;

class code7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<size;i++){
            if(arr[i]%4==0){
                System.out.println(arr[i]+" is divisible by 4 and its index is "+i);
                
            }
        }
    }
    
}
