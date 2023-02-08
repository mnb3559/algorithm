import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int mod = 0;
        for(int i=0; i<s.length(); i++){
            mod = (10*mod + (s.charAt(i)-'0'))%20000303;
        }

        System.out.println(mod);
    }
}