package Java.Array.Array2;
import java.util.*;

class code8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(arr[i]>5 && arr[i]<9)
            System.out.println(arr[i]+" greater than 5 but less than 9");
        }

    }
    
}
