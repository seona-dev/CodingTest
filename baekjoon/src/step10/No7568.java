package step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No7568 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int person = Integer.parseInt(br.readLine());
		
		List<Integer> weight = new ArrayList<Integer>();
		List<Integer> height = new ArrayList<Integer>();
		
		for(int i=0;i<person;i++) {
			String thisPerson = br.readLine();
			int w = Integer.parseInt(thisPerson.split(" ")[0]);
			int h = Integer.parseInt(thisPerson.split(" ")[1]);
			weight.add(w);
			height.add(h);
		}
		
		int[] result = getResult(person, weight, height);
		resultPrint(result);
	}
	
	public static int[] getResult(int person, List<Integer> weight, List<Integer> height) {
		int[] result = new int[person];
		
		for(int i=0;i<person;i++) {
			int cnt = 0;
			for(int j=0;j<person;j++) {
				if(i==j) continue;
				if(weight.get(i)<weight.get(j) && height.get(i)<height.get(j)) {
					cnt++;
				}
			}
			result[i] = cnt;
		}
		
		return result;
	}
	
	public static void resultPrint(int[] result) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<result.length;i++) {
			sb.append(result[i]+1);
			if(i!=result.length-1) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
