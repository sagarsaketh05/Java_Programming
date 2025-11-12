import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0 ; i<s.length();i++){
            if(i%2==0)
            System.out.print(s.charAt(i) +" ");
        }
        System.out.println();
        int c= 0 ;
        for(int i = 0 ; i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
                if(c%2==1){
                    System.out.print(ch + " ");
                }
            }

        }
    }
}
