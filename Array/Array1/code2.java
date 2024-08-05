package Java.Array.Array1;
import java.io.*;

class code2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of an array:");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];
        System.out.println("Enter array Element:");
        for(int i=0;i<size;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
