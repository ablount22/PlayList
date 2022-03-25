import java.lang.Math;
import java.util.Scanner;

public class FloorCeiling {
	
	public static void main(String[] args) {
		
		Scanner decimal = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		
		double userinput = decimal.nextDouble();
		
		System.out.println("Ceiling of " + userinput + "=" + Math.ceil(userinput));
		System.out.println("Floor of " + userinput + "=" + Math.floor(userinput));
		
		decimal.close();
	}

}
