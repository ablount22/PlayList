import java.util.ArrayList;
import java.util.Scanner;

public class StateNamesHashMap {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		Scanner statename = new Scanner(System.in);
		
		System.out.println("Enter the states you have visted one at a time");
		
		String userinput = statename.nextLine();
		
		names.add(userinput);
		
		/*while(userinput != "done") {
			System.out.println("Enter the states you have visted one at a time");
			names.add(userinput);
			
			
			if(userinput == "done") {
				System.out.println(names);*/
			}
			
		}
		
		
		
	}


}
