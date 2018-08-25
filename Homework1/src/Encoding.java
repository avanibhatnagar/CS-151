import java.util.*;
/**
 * Hw 1 - Strings.java
 * @author Avani Bhatnagar
 *
 */
public class Encoding {
	
	public static Set<String> morseCodes(int m, int n){
		Set<String> answer = new TreeSet<>();
		if((m==0) && (n==0)){
			answer.add("");
		}
		else if(m==0){
			for(String s: morseCodes(m,n-1)){
				answer.add(s+"-");
			}
		}
		else if(n==0){
			for(String s : morseCodes(m-1,n)){
				answer.add(s+".");
			}			
		}
		else{
			for(String s: morseCodes(m-1,n)){
				answer.add(s+".");
			}
			for(String s : morseCodes(m,n-1))
			{
				answer.add(s+"-");
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		System.out.println(morseCodes(2, 1));
	}
}    