/*
 * Author: Sierra Andersen
 * Date: 14 Feb 2023
 * 
 * This program asks the user for two strings and tests if the last string is a substring of the first.
 */
import java.util.Scanner;

public class PatternMatching {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Type a string: ");
		String s1 = input.nextLine();
		System.out.println("Type another string: ");
		String s2 = input.nextLine();

		boolean substringMatch = false;
		int substringStart = -1;

		if(s1.length() < s2.length())
			System.out.println("The 2nd string is longer than the 1st and cannot be a substring.");

		else {
			for(int i = 0; i < s1.length()-s2.length(); i++) {
				if(s2.equals(s1.substring(i, i+s2.length()))) {
					substringMatch = true;
					substringStart = i;
					i = s1.length()-s2.length();
				}
			}

			if(substringMatch) 
				System.out.println("The substring can be found starting at index " + substringStart);	

			else
				System.out.println("The substring was not found.");
		}
	}

}
