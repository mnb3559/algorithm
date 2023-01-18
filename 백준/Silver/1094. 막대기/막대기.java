import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int X = Integer.parseInt(br.readLine());
			
			Deque<Integer> deque = new LinkedList<>();
			deque.add(64);
			int sum = 64;
			while(X<sum) {
				//1. 가지고 있는 막대 중 길이가 가장 짧은 막대를 이등분한다.
				//길이가 가장 짧은 막대 꺼내기
				int md = deque.pollLast();
				//이등분하여 둘중 하나만 다시 넣기
				deque.add(md/2);
				//deque에 들어있는 막대의 길이의 합 갱신
				sum -= md/2;
				
				//2. 만약, 위에서 이등분한 막대 중 하나를 제외한 나머지의 모든 막대의 길이의 합이 Xcm보다 크거나 같다면, 제외한 조각을 버린다.
				if(sum==X) break;
				if(sum>X) continue;
				//X보다 작다면 버리지 않는다.
				//이등분 한 막대 중 하나 다시 넣기
				deque.add(md/2);
				//deque에 들어있는 막대의 길이의 합 갱신
				sum += md/2;
			}
			
			System.out.println(deque.size());
		
	}

}