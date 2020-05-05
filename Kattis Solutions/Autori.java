import java.util.ArrayList;
import java.util.Scanner;

public class Autori {
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char[] ch = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = s.charAt(i);
		}
		result.add(Character.toString(ch[0]));
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '-') {
				result.add(Character.toString(ch[i + 1]));
			}
		}
		System.out.println(result.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "").trim());
		input.close();
	}
}
