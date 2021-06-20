package jumptojava;

import java.util.ArrayList;

public class forTest {
	public static void main(String[] args) {
		for (int i = 1; i<10; i++) {
			for (int k=1; k<10; k++) {
				System.out.print(i*k+" "); // print = ÁÙ ¹Ù²Þ ¾øÀ½
			}
			System.out.println(""); // println = ÁÙ ¹Ù²Þ ÀÖÀ½
		}
		
		ArrayList<String> numbers = new ArrayList<String>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");

		for(String number: numbers) {
		    System.out.println(number);
		}
		for(String i: numbers) {
			System.out.print(i);
		}
//		int[] odds = {33,22,11,45,21};
//		for (int i=0; i<odds.length; i++) {
//			if (odds[i] < 25) {
//				continue;
//			}
//			System.out.println("Test"+odds[i]);
//		}
	}
}
