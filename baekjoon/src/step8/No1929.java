package step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1929 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int m = Integer.parseInt(input.split(" ")[0]);
		int n = Integer.parseInt(input.split(" ")[1]);
		boolean[] primes = new boolean[n+1];
		primes[0] = primes[1] = true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(primes[i]) continue;
			for(int j=i*i;j<primes.length;j+=i) {
				primes[j] = true;
			}
		}
		for(int i=m;i<=n;i++) {
			if(!primes[i]) {
				System.out.println(i);
			}
		}
	}
}
