package arrays;

import java.util.Scanner;
    public class Gcd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i = 0 ; i<n ; i++)
            {
                A[i] = sc.nextInt();
            }
            int s = Integer.MAX_VALUE;
            for(int i =0 ; i<n ; i++){
                if(A[i] < s ){
                    s= A[i] ;
                }
            }
            for(int i = s ; i>=1 ; i--){
                int c=0;
                for(int j = 0 ; j<n ; j++){
                    if(A[j]%i==0)
                    {
                        c++;
                    }
                }
                if(c==n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }


