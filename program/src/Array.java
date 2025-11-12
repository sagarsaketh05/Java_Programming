import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        int count=0;
        for (int i = 0 ; i<n ; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i = n-1 ; i>=0 ; i--)
        {
            System.out.println(arr[i]);
        }
        for(int i=0 ;i<n ;i++)
        {
            int fc =0;
            for(int j = 2 ; j<=(int)Math.sqrt(arr[i]);j++)
            {
                if(arr[i]%j==0)
                {
                    fc++;
                    break;
                }
            }
            if(fc==0 && arr[i]>1){
                sum+=arr[i];
                count++;
            }
                //System.out.println(arr[i]);
        }
        float avg = (float)sum/count;
        System.out.println("Avg : "+ avg);


    }
}
