package Java.Array.Array1;
import java.util.Scanner;

class code6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size:");
        int size = sc.nextInt();

        char arr[] = new char[size];
        System.out.println("Enter input character:");

        for(int i=0;i<size;i++){
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Elements are:");

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
