package arrays;

import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int A[] = new int[n];
         for(int i = 0 ; i<n ; i++)
         {
             A[i] = sc.nextInt();
         }
         int h = Integer.MIN_VALUE;
         for(int i =0 ; i<n ; i++){
             if(A[i] > h ){
                 h= A[i] ;
             }
         }
         for(int i = h ; true ; i+=h){
             int c=0;
             for(int j = 0 ; j<n ; j++){
                 if(i%A[j]==0)
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
