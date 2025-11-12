import java.util.Arrays;
import  java.util.Scanner;
public class sumOfSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ; i++)
        {
            for(int j = i ; j<n ; j++){
                int sa[] = new int[j-i+1];
                int ind=0,sum=0;
                for (int k = i; k <=j; k++) {
                    sum +=arr[k];
                    sa[ind++]=arr[k];

                }
        System.out.println(Arrays.toString(sa) + " "+ sum);

            }
        }
    }
}
