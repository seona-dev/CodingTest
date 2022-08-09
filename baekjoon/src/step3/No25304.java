package step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No25304 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int receipt = Integer.parseInt(br.readLine());
		int size = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0;i<size;i++) {
			String line = br.readLine();
			int price = Integer.parseInt(line.split(" ")[0]);
			int amount = Integer.parseInt(line.split(" ")[1]);
			sum += price * amount;
		}
		if(sum==receipt) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}