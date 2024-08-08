package Java.Array.Array2;
import java.util.Scanner;

class code1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count = 0;

        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("even numbers are:");
        for(int i=0;i<size;i++){
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
                count++;
            }
          
        }
        System.out.println();
        System.out.print("Count of even elements: "+count);
    }
    
}
