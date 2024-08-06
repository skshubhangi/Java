package Java.Array.Array1;

import java.util.Scanner;

class code3{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter size of an Array:");
            int size=sc.nextInt();
            int arr[]=new int[size];
            System.out.print("Enter array element:");
            for(int i=0;i<size;i++){
                    arr[i]=sc.nextInt();
            }
            System.out.print("Even elements of an array:");
            for(int i=0;i<size;i++){
                    if(arr[i]%2==0){
                            System.out.print(arr[i]+" ");
                    }
            }
            System.out.println();
    }
}