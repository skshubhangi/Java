package Java.Array.Array1;

import java.util.Scanner;

class code5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array element:");

        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<size;i++){
            if(arr[i]<10){
                System.out.println(arr[i]+ " is less than " +10);
            }
        }

    }
    
}
