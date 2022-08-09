package step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No4948 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int startNumber;
		int endNumber;
		
		while(true) {
			startNumber = Integer.parseInt(br.readLine());
			endNumber = 2*startNumber;
			
			if(startNumber==0) break;
			
			boolean[] chkPrime = new boolean[endNumber+1];
			chkPrime[0] = chkPrime[1] = true;
			
			for(int i=2;i<=Math.sqrt(endNumber);i++) {
				if(chkPrime[i]) continue;
				for(int j=i*i;j<chkPrime.length;j+=i) {
					chkPrime[j] = true;
				}
			}
			
			int cnt = 0;
			for(int i=startNumber+1;i<=endNumber;i++) {
				if(!chkPrime[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
