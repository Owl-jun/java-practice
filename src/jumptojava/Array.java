package jumptojava;

public class Array {
	public static void main(String[] args) {
		int[] odds = {1,3,5,7,9};
		String[] weeks = {"mon","tue","wed","thu","fri","sat","sun"};
		String[] days = new String[7];
		days[0] = "mon";
		days[1] = "tue";
		days[6] = "vovo";
		System.out.println(days[6]);
		for (int i=0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
	}
}
