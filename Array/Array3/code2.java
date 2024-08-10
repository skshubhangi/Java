package Java.Array.Array3;
import java.util.Scanner;

class code2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int count=0;
        int temp=0;
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Specific number:");
        int num = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==num){
            count++;
            temp=i;
            }
        }
        if(count>0){
            System.out.println("num "+num+" occurred "+count+" times in an array at index "+temp);
        }else if(count==0){
            System.out.println("Element not found");
        }
    }
}
