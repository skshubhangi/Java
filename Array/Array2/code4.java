package Java.Array.Array2;
import java.util.Scanner;

class code4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size= sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to search in array:");
        int num = sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==num)
            System.out.println(num+" found at index "+i);
        }
    }
    
}
