import java.util.Scanner;

public class Retirement {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (keyboard.hasNextLong()) {
			try {
				String input = keyboard.nextLine();
				String[] arrInput = input.split(" ", 5);

				//converting string to int
				int a = Integer.parseInt(arrInput[3]);// Alice's age
				int b = Integer.parseInt(arrInput[0]); // Bob's age
				int br = Integer.parseInt(arrInput[1]); // Bob's retirement age
				int as = Integer.parseInt(arrInput[4]); // Alice's retirement age
				int bs = Integer.parseInt(arrInput[2]); // Bob's yearly saving
				
				//Check to see if the 
				if (b>100 || b<20 || br>100 || br<20 || a<20 || a>100 || as<1 || as>100 || bs<1 || bs>100) {
					System.out.println("Check your number limits");
					break;
				}
				
				//Bobs saving formula
				int bobTotalSave = bs * (br - b);
				
				//Alices retirement formula
				int Ar = (bobTotalSave / as) + a + 1;
				System.out.println(Ar);
				
			} catch (Exception e) {
				System.out.println("Wrong or incomplete input");
			}
		} 
	}
}
