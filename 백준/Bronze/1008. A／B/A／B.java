import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b;
        a = s.nextInt();
        b = s.nextInt();
        double r = (double)a/(double)b;
        System.out.printf("%.9f",r);
	}
}