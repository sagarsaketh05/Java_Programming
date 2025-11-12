import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n ; i++){
            for(int j= i+1 ; j<n ; j++){
                arr[i] = arr[i]+arr[j] - (arr[j]=arr[i]);
            }
        }
        int ele = sc.nextInt();
        int l = 0, r = n - 1;
        boolean b = false;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == ele) {
                b = true;
                break;
            } else if (arr[mid] > ele) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        if (b) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}



