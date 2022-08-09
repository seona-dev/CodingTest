package step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No2231 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		boolean flag = false;
		
		for(int i=0;i<input;i++) {
			int temp = i;
			int sum = i;
			
			while(temp>0) {
				int j = temp%10;
				sum += j;
				temp /= 10;
			}
			
			if(sum==input) {
				flag = true;
				System.out.println(i);
				break;
			}
		}
		if(!flag) {
			System.out.println(0);
		}
	}
}
