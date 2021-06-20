package jumptojava;

import java.util.ArrayList;

public class ifTest {
	public static void main(String[] args) {
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("coin");
		pocket.add("cigar");
		if (pocket.contains("money")) {
			System.out.println("택시 타시오");
		} else if(pocket.contains("cigar")) {
			System.out.println("담배피며 걸어가시오");
		}
	}	
//		int money = 2000;
//		boolean hasCard = true;
//		int hasCardMoney = 3000;
//		if (money >= 3000 || hasCard && hasCardMoney >= 3000) {
//			System.out.println("택시를 타고 가십시오.");
//		} else {
//			System.out.println("돈이 없으니 걸어가시오.");
//		}
//	}
		
}
