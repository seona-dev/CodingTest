package step10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No2798 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String firstLine = br.readLine();
		int[] setting = getSetting(firstLine);
		int cardNum = setting[0];
		int maximum = setting[1];
		
		String secondLine = br.readLine();
		List<Integer> cardList = getCard(secondLine, cardNum);
		
		int max = getMax(cardList, cardNum, maximum);
		System.out.println(max);
	}
	
	public static int[] getSetting(String line) {
		int[] numberArr = {
				Integer.parseInt(line.split(" ")[0]),
				Integer.parseInt(line.split(" ")[1]),				
		};
		return numberArr;
	}
	
	public static List<Integer> getCard(String line, int cardNum) {
		List<Integer> cardSet = new ArrayList<Integer>();
		for(int i=0;i<cardNum;i++) {
			cardSet.add(Integer.parseInt(line.split(" ")[i]));			
		}
		return cardSet;
	}
	
	public static int getMax(List<Integer> cardList, int cardNum, int maximum) {
		int max = 0;
		int tempMax = 0;
		for(int x=0;x<cardNum;x++) {
			for(int y=x+1;y<cardNum;y++) {
				for(int z=y+1;z<cardNum;z++) {
					tempMax = cardList.get(x)+cardList.get(y)+cardList.get(z);
					if(tempMax>max && tempMax<=maximum) max = tempMax;
				}
			}
		}
		return max;
	}
}
