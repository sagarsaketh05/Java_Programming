package arrays;

import java.util.Scanner;

public class Armstrong {
    public static int digitcount(int n  , int c)
    {
        if(n>0)
        {
            int r = n%10;
            n/=10;
            return digitcount(n,c+1);
        }
        return c;
    }
    public static int isArmstrong(int n , int arm)
    {
        int dup =digitcount(n,0);
        if(n>0)
        {
            int r = n%10;
            n/=10;
            arm = arm+(int)Math.pow(r,dup);
            return isArmstrong(n,arm);
        }
        return arm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArmstrong(n,0)==n)
        {
            System.out.println("armtrong");
        }
    }
}
