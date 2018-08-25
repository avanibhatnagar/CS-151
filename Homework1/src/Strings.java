/**
 * Hw 1 - Strings.java
 * @author Avani Bhatnagar
 *
 */
public class Strings {

	/**
	 * Method to return unique letters in a String
	 * @param str 
	 * @return the unique letters
	 */
	public static String uniqueLetters(String str){
		String answer="";
		for(int i=0; i<str.length(); i++){
			int count = 0;
			for(int j = 0; j < str.length(); ++j){
				if(str.charAt(i)==str.charAt(j)){
					++count;
				}
			}
			if(count==1){
				answer += String.valueOf(str.charAt(i));
			}
		}
		return answer;
	}
	
	/**
	 * The main method calls the above implemented uniqueLetters method.
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println(uniqueLetters("harrassess"));
		System.out.println(uniqueLetters(""));		
	}

}
