import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Babelfish {

	public static void main(String[] args) {

		HashMap<String, String> result = new HashMap<>();
		
		try {
			Scanner input = new Scanner(new File("C.0.in"));
			while(input.hasNext()){
				
				String sTemp = input.nextLine();
				if (sTemp.isEmpty()) {
					break;
				}
				String[] arrTemp = sTemp.split(" ");
				result.put(arrTemp[1], arrTemp[0]);
			}
			while(input.hasNext()) {
				String sTemp = input.nextLine();
				if (result.containsKey(sTemp)){
					System.out.println(result.get(sTemp));
				}
				else {
					System.out.println("eh");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
