package Java.Array.Array3;
import java.util.*;

class code6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        char arr[] = new char[size];
        System.out.println("Enter array element:");
        for(int i=0;i<size;i++){
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<size;i++){
            if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'||
            arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){

            }else{
                System.out.print(arr[i]+" ");
            }
        }

    }
    
}
