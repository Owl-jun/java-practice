package jumptojava;

public class whileTest {
	public static void main(String[] args) {
		int cnt = 0;
		while (cnt < 10) {
			System.out.println("나무 타격!" + (cnt+1) + "회");
			cnt ++;
		}
		System.out.println("나무 사망");
	}
}
