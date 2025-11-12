import java.sql.SQLOutput;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int sum=0;
        int arr[]= new int[n];
        for(int i = 0 ; i<n ; i++)
             arr[i]=sc.nextInt();
//        for(int i = 0 ; i<n-1 ; i+=2){
//            arr[i] = (arr[i] + arr[i+1]) - (arr[i+1]=arr[i]);
//
//        }
        for(int i = 0 ; i<n ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i]+arr[j]==key)
                    System.out.println(arr[i]+","+arr[j]);
            }
        }
//            System.out.println(sum);


    }
}
