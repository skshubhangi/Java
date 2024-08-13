package Java.Array.Array3;
import java.util.Scanner;

class code8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Composite numbers are:");
        for(int i=0;i<size;i++){
            int count =0;
            int temp=1;
            while(temp<=arr[i]){
                if(arr[i]%temp==0){
                    count++;
                }
                temp++;
            }
            if(count>2){
                System.out.print(arr[i]+" ");
            }
        }
        
    }
}