package core.ProjectTwo;

import java.util.HashMap;


/*
 * If the word "stress" is input then it should print 't' as output .
 * If the word "teeter" is input then it should print 'r' as output .
 */

public class TaskOne {
	public static void main(String args[]){
		System.out.println(findChar("teeter"));
	}
	
	private static char findChar(String word){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0; i < word.length(); i++){
			if(hm.containsKey(word.charAt(i))){
				int value = (Integer)hm.get(word.charAt(i)) + 1;
				hm.put(word.charAt(i), value);		
			}
			else{
				hm.put(word.charAt(i), 1);
			}
		}
		
		for(int j = 0; j < word.length(); j++){
			if((Integer)hm.get(word.charAt(j)) == 1){
				return word.charAt(j);
			}
		}
		
		return 0;
		
	}

}
