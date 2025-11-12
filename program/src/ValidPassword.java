import java.util.*;
public class ValidPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean uc=false,lc=false,dc=false,sp=false,spc=true;
        if(s.length()>=8 && s.length()<=16) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch))
                    dc = true;
                else if (Character.isUpperCase(ch)) {
                    uc = true;
                } else if (Character.isLowerCase(ch)) {
                    lc = true;
                } else if (ch != ' ') {
                    sp = true;
                } else {
                    spc = false;
                    break;
                }
            }
        }
        else {
            if(uc&&lc&&dc&&sp&&spc&&(s.length()>=8 && s.length()<=16) )
                System.out.println("Valid Password");
            else
                System.out.println("Invalid Password");

            }
        }
    }

