import java.util.*;
public class ValidVehicleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        if (s.length() == 10) {

                char ch;
                for(int j = 0 ; j<=1; j++){
                    ch=s.charAt(j);
                    if(Character.isUpperCase(ch))
                        c++;
                }
                for(int j = 2 ; j<=3;j++){
                    ch=s.charAt(j);
                    if(Character.isDigit(ch))
                        c++;
                }
                for(int j = 4 ; j<=5; j++){
                    ch=s.charAt(j);
                    if(Character.isUpperCase(ch))
                        c++;
                }
                for(int j = 6 ; j<s.length();j++){
                    ch=s.charAt(j);
                    if(Character.isDigit(ch))
                        c++;
                }
        }
        if (c==10){
            System.out.println("valid Vehicle Number");
        }
        else
            System.out.println("Invalid Vehicle Number");
    }
}
