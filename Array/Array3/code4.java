package Java.Array.Array3;

import java.util.*;


class code4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(i%2==0){
                arr[i]=1;
            }else{
                arr[i]=0;
            }
            System.out.print(arr[i]+" ");
        }
    }
}