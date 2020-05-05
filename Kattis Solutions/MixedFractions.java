import java.util.Scanner;

public class MixedFractions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (keyboard.hasNextLong()) {
			try {
				String input = keyboard.nextLine();
				if (!input.equals("0 0")) {
					String y1 = null;
					String y2 = null;
					long result;
					long result2;
					for (int i = 0; i < input.length(); i++) {
						if (input.charAt(i) == ' ') {
							y1 = input.substring(i + 1);
							y2 = input.substring(0, i);
						}
					}
					long x = Long.parseLong(y1); // This is the Numerator
					long y = Long.parseLong(y2); // This is the Denominator
					result = y % x;
					result2 = ((y - result) / x);
					System.out.println(result2 + " " + result + " / " + x);
				} else {
					System.exit(0); // "0 0" terminates the loop
				}
			} catch (Exception e) {
				System.exit(0);
			}
		}
	}
}
