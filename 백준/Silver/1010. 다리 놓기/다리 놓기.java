import java.util.Scanner;

public class Main {
    
	//M개 중 N개 조합 구하는 문제

	static int[][] combArr = new int[30][30]; // N,M은 0~29 
	
	static int comb(int n, int r) {
		if(n==r || r==0) return 1;
		else if(combArr[n][r] == 0) combArr[n][r] = comb(n-1, r-1)+comb(n-1,r);
		return combArr[n][r];
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=0; tc<T; tc++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.println(comb(M,N));
		}
	}
}