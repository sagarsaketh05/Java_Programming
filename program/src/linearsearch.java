import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int ele=sc.nextInt();
        boolean b = false;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]==ele){
                b=true;
                break;
            }
        }
        if(b){
            System.out.println("Found");
        }
        else
            System.out.println("Not Found");
    }
}
