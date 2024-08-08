package Java.Array.Array2;
import java.util.Scanner;
class code2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum =0;
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements divisible by 3:");

        for(int i=0;i<size;i++){
            if(arr[i]%3==0){
                System.out.println(arr[i]+" ");
                sum=sum+arr[i];
            }
        }
        System.out.println("sum of elements divisible by 3: "+sum);
    }
    
}
