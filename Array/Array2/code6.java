package Java.Array.Array2;
import java.util.Scanner;

class code6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int product =1;
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(i%2==1)
            product*=arr[i];
        }

        System.out.println("product of odd indexed elements: "+product);

    }
    
}
