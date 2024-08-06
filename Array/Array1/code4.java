package Java.Array.Array1;

import java.util.Scanner;

class code4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array:");
        int size = sc.nextInt();
      
        int arr[] = new int[size];
        int sum = 0;
        System.out.println("Enter Array Element:");

        for(int i = 0 ; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ;i<size; i++){
            if(arr[i]%2==1){
                sum = sum+arr[i];
            }
        }
        System.out.println("Sum of odd elements :"+sum);
    }
    
}
