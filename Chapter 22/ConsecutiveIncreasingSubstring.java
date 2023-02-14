/*
 * Author: Sierra Andersen
 * Date: 13 Feb 2023
 * 
 * This program finds the longest substring that has consecutive increasing characters.
 */
import java.util.Scanner;

public class ConsecutiveIncreasingSubstring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a string: ");
		String string = input.nextLine();
		
		System.out.println("The longest consecutive substring is: "+ longestSubstring(string));
		
	}
	
	public static String longestSubstring(String str1) {
		
		
		String longestSub = "";
		String tempSub = ""+str1.charAt(0);
		
		for(int i = 1; i<str1.length(); i++) {
			
			if(str1.charAt(i)==str1.charAt(i-1)+1) {
				
				tempSub += str1.charAt(i);
			}
			else
				tempSub = "" + str1.charAt(i);
			
			if(tempSub.length()>longestSub.length())
				longestSub = tempSub;
		}
		
		
		
		return longestSub;
	}

}
