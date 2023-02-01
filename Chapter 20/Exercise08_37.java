/*
 * Modifier: Sierra Andersen
 * Date: 31 Jan 2023
 * 
 * This program has been modified to ask the user for the capital of a randomly selected state.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercise08_37 {
  public static void main(String[] args) {
	  //Create ArrayLists to store states and capitals
	  ArrayList<String> states = new ArrayList<String>();
	  ArrayList<String> capitals = new ArrayList<String>();

	  states.add("Alabama");
	  capitals.add("Montgomery");
      states.add("Alaska");
      capitals.add("Juneau");
      states.add("Arizona");
      capitals.add("Phoenix");
      states.add("Arkansas");
      capitals.add("Little Rock");
      states.add("California");
      capitals.add("Sacramento");
      states.add("Colorado");
      capitals.add("Denver");
      states.add("Connecticut");
      capitals.add("Hartford");
      states.add("Delaware");
      capitals.add("Dover");
      states.add("Florida"); 
      capitals.add("Tallahassee");
      states.add("Georgia"); 
      capitals.add("Atlanta");
      states.add("Hawaii");
      capitals.add("Honolulu");
      states.add("Idaho"); 
      capitals.add("Boise");
      states.add("Illinois");
      capitals.add("Springfield");
      states.add("Indiana");
      capitals.add("Indianapolis");
      states.add("Iowa");
      capitals.add("Des Moines");
      states.add("Kansas");
      capitals.add("Topeka");
      states.add("Kentucky");
      capitals.add("Frankfort");
      states.add("Louisiana"); 
      capitals.add("Baton Rouge");
      states.add("Maine"); 
      capitals.add("Augusta");
      states.add("Maryland");
      capitals.add("Annapolis");
      states.add("Massachusettes");
      capitals.add("Boston");
      states.add("Michigan");
      capitals.add("Lansing");
      states.add("Minnesota");
      capitals.add("Saint Paul");
      states.add("Mississippi");
      capitals.add("Jackson");
      states.add("Missouri");
      capitals.add("Jefferson City");
      states.add("Montana");
      capitals.add("Helena");
      states.add("Nebraska");
      capitals.add( "Lincoln");
      states.add( "Nevada");
      capitals.add("Carson City");
      states.add("New Hampshire");
      capitals.add("Concord");
      states.add("New Jersey");
      capitals.add("Trenton");
      states.add("New York");
      capitals.add("Albany");
      states.add("New Mexico");
      capitals.add("Santa Fe");
      states.add("North Carolina");
      capitals.add("Raleigh");
      states.add("North Dakota");
      capitals.add("Bismarck");
      states.add("Ohio");
      capitals.add("Columbus");
      states.add("Oklahoma");
      capitals.add("Oklahoma City");
      states.add("Oregon");
      capitals.add("Salem");
      states.add("Pennsylvania");
      capitals.add("Harrisburg");
      states.add("Rhode Island");
      capitals.add("Providence");
      states.add("South Carolina");
      capitals.add("Columbia");
      states.add("South Dakota");
      capitals.add("Pierre");
      states.add("Tennessee");
      capitals.add("Nashville");
      states.add("Texas");
      capitals.add("Austin");
      states.add("Utah");
      capitals.add("Salt Lake City");
      states.add("Vermont");
      capitals.add("Montpelier");
      states.add("Virginia");
      capitals.add("Richmond");
      states.add("Washington");
      capitals.add("Olympia");
      states.add("West Virginia");
      capitals.add("Charleston");
      states.add("Wisconsin");
      capitals.add("Madison");
      states.add("Wyoming");
      capitals.add("Cheyenne");

    Scanner input = new Scanner(System.in);
    
    int correctCount = 0;
    
    //Shuffle the states and capitals into a random order.
    long shuffleSeed = (long)(Math.random()*1000000);
    Collections.shuffle(states, new Random(shuffleSeed));
    Collections.shuffle(capitals, new Random(shuffleSeed));
    
    for (int i = 0; i < states.size(); i++) {
      // Prompt the user with a question
      System.out.print("What is the capital of " + states.get(i) + "? ");
      String capital = input.nextLine().trim().toLowerCase();
      
      if (capital.toLowerCase().equals(capitals.get(i).toLowerCase())) {
        System.out.println("Your answer is correct");
        correctCount++;
      }
      else
        System.out.println("The correct answer should be " + capitals.get(i));
    }

    System.out.println("The correct count is " + correctCount);
  }
}
