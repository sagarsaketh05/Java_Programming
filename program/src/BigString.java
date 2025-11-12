import  java.util.*;
public class BigString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String sa[] = s1.split("\\s+");
        String s = "";
        for(int i = 0 ; i< sa.length; i++){
            if(sa[i].length() > s.length())
                s=sa[i];
        }
        System.out.println(s);

    }
}
