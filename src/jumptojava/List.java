package jumptojava;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		pitches.add(0, "158"); // �ε����� 0��°�� 158 ����.
		System.out.println(pitches.get(0));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("142"));
		System.out.println(pitches.remove(0));
		System.out.println(pitches.remove("129"));
		System.out.println(pitches);
	}
}
