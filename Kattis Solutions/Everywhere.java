import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {

	public static void main(String[] args) {

		Set<String> result = new HashSet<String>();

		//Scanner input = new Scanner(new File("everywhere-01.in"));
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		for (int i = 0; i < n1; i++) {
			int n2 = input.nextInt();
			for (int j = 0; j < n2; j++) {
				result.add(input.next());
			}
			System.out.println(result.size());
			result.clear();
		}
	}
}
