package jumptojava;

import java.util.ArrayList;

public class ifTest {
	public static void main(String[] args) {
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("coin");
		pocket.add("cigar");
		if (pocket.contains("money")) {
			System.out.println("�ý� Ÿ�ÿ�");
		} else if(pocket.contains("cigar")) {
			System.out.println("����Ǹ� �ɾ�ÿ�");
		}
	}	
//		int money = 2000;
//		boolean hasCard = true;
//		int hasCardMoney = 3000;
//		if (money >= 3000 || hasCard && hasCardMoney >= 3000) {
//			System.out.println("�ýø� Ÿ�� ���ʽÿ�.");
//		} else {
//			System.out.println("���� ������ �ɾ�ÿ�.");
//		}
//	}
		
}
