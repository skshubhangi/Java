package Java.Array.Array3;
import java.util.Scanner;

class code10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int product=1;
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prime elements are:");
        for(int i=0;i<size;i++){
            int temp=1;
            int count=0;
            while(arr[i]>=temp){
                if(arr[i]%temp==0){
                    count++;
                }
                temp++;
            }
            if(count==2){
                product = product*arr[i];
            }
        }
        System.out.println(product);
    }
    
}

