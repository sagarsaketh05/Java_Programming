import java.util.*;
public class ValidAadhar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c=0;
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i);
            if (Character.isDigit(ch)){
                c++;
            } else if ((i==4||i==9)&&s.charAt(4)==' ' && s.charAt(9)==' ') {
                continue;

            }
            else {
                c=-1;
                break;
            }
        }
        if(c==12)
            System.out.println("valid Aadhar number");
        else
            System.out.println("Invalid Aadhar Number");
    }
}
