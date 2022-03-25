
public class ForeverLoop {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		while(true) {
			counter++;
			if(counter == 5) {
				break;
			}
	if(counter == 3) {
		continue;
	}
	System.out.println(counter);
		}
		
		
	}

}
