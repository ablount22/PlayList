
public class ReverseString {
	
public static void main(String[] args) {
	
	String str = "The first program is Hello World.";
	String[] strArr = str.split("\\s+");
	
	
		
		for(int i = strArr.length - 1; i >=0; i--) {
		System.out.println(strArr[i] + ""); 
		}
	
	
	/* String ans = ""'
	 * for(int i = s.length - 1; i >= 0; i--) {
	 * ans += s[i] + "";
	 * }
	 * 
	 */
	
	
}
}
