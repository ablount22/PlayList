import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner leapyear = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int userinput = leapyear.nextInt();
		
		if((userinput % 4==0 && userinput % 100 ==0) || userinput % 400 == 0 ) {
			
			System.out.println("The year you entered is a leap year.");
		}
		
		else {
			System.out.println("The year you entered is not leap year.");
		}
		
		leapyear.close();
		
	}
}
