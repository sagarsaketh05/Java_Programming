package arrays;

import java.util.*;
public class circularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int ele = arr[0];
            System.out.println(Arrays.toString(arr));
            for (int j = 1; j < n; j++) {
                arr[j-1] = arr[j];
            }
            arr[n-1] = ele;
        }
    }
}
