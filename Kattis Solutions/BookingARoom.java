import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookingARoom {

	public static void main(String[] args) {
		
		int count = 0;
		int numberOfRooms = 0;
		int takenNumberOfRooms = 0;
		
		ArrayList<Integer> bookedRoom = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		String[] stringArr = input.nextLine().split(" ");
		numberOfRooms = Integer.parseInt(stringArr[0]);
		takenNumberOfRooms = Integer.parseInt(stringArr[1]);
		
		while(input.hasNext()) {
			count++;
			int iTemp = input.nextInt();
			bookedRoom.add(iTemp);
		}
		if (!(numberOfRooms - count > 0) || !(numberOfRooms - takenNumberOfRooms > 0)) {
			System.out.println("too late");
		}
		else {
			boolean flag = false;
			while(!flag) {
				Random random = new Random();
				int ran = random.nextInt(numberOfRooms);
				if (!bookedRoom.contains(ran)) {
					System.out.println(ran);
					flag = true;
				}	
			}
		}
	}
}
