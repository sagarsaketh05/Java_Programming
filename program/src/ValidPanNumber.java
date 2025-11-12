import java.util.*;
public class ValidPanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String name = sc.nextLine();
        char nc = name.charAt(name.lastIndexOf(" ")+1);
        nc = Character.toUpperCase(nc);
        int c=0;
        if(s.length()==10){

                char ch ;
                for(int i = 0 ; i<=2; i++) {
                    ch = s.charAt(i);
                    if (Character.isUpperCase(ch))
                        c++;
                }
                ch=s.charAt(3);
                if(ch=='P'||ch=='F'||ch=='U'||ch=='C'||ch=='H'||ch=='T'||ch=='O')
                    c++;
                ch=(s.charAt(4));
                if (Character.isUpperCase(ch))
                    c++;
                for (int j = 5; j <9; j++) {
                    ch=s.charAt(j);
                    if(Character.isDigit(ch))
                        c++;
                }
                if(Character.isUpperCase(s.charAt(9)))
                    c++;


        }
            if(c==10)
                System.out.println("valid Pan Number");
            else
                System.out.println("Invalid Pan Number");
    }
}
