import java.util.Scanner;

public class Palindrome {
    public static int isPalindrome(int n , int rev){
        if(n>0)
        {
            int r = n%10;
            n/=10;
            rev = rev*10+r;
            return isPalindrome(n , rev);
        }
        return rev;
    }
    public static int range(int n , int n1)
    {
        int sum = 0;
        if(n<=n1)
        {
            if(isPalindrome(n,0)==n)
            {
                sum=n;
            }
            return sum+range(n+1, n1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        System.out.println(range(n, n1));
    }
}
