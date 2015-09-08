package core.ProjectTwo;
/*
 * Convert String To Int In Java Without Using Integer ParseInt() Method
 * If user inputs "12345" ,then it should give output 12345 as an int number 
 */
public class TaskTwo {
	
	public static void main(String args[]){
		System.out.println(strConvToInt("123456"));
	}
	
	public static int strConvToInt(String str){
		
		int newInt = Integer.parseInt(str);
		return newInt;
		
	}

}
