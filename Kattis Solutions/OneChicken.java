import java.util.Scanner;

public class OneChicken {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (keyboard.hasNextLong()) {
			try {
				String input = keyboard.nextLine();
				String y1 = null;
				String y2 = null;
				int result;
				// break the input into two separate strings
				for (int i = 0; i < input.length(); i++) {
					if (input.charAt(i) == ' ') {
						y1 = input.substring(i + 1);
						y2 = input.substring(0, i);
					}
				}
				int x = Integer.parseInt(y2); // This is the first number
				int y = Integer.parseInt(y1); // This is the second number

				// perform logic
				if ((x >= 0 || x <= 1000) && (y >= 0 || y <= 1000)) {
					if (x > y) {
						result = x - y;
						if (result == 1) {
							System.out.printf("Dr. Chaz needs %d more piece of chicken! \n", result);
						} else {
							System.out.printf("Dr. Chaz needs %d more pieces of chicken! \n", result);
						}
					} else if (y > x) {
						result = y - x;
						if (result == 1) {
							System.out.printf("Dr. Chaz will have %d piece of chicken left over! \n", result);
						} else {
							System.out.printf("Dr. Chaz will have %d pieces of chicken left over! \n", result);
						}
					} else {
						System.exit(0);
					}
				}
			} catch (Exception e) {
				System.exit(0);
			}
		}
	}
}
