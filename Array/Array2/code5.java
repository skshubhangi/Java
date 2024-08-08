package Java.Array.Array2;
import java.util.Scanner;

class code5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(i%2==1){
                sum+=arr[i];
            }
        }
        System.out.println("Sum of odd indexed elements:"+sum);

    }
    
}
