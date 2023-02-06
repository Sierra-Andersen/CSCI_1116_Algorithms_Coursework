/*
 * Author: Sierra Andersen
 * Date: 6 Feb 2023
 * 
 * This program tests the GenericQueue and shows that the dequeue and enqueue methods are working.
 */
public class Exercise24_5TestCase {

	public static void main(String[] args) {
		GenericQueue<String> teamQueue = new GenericQueue<String>();
		
		teamQueue.enqueue("Sky Dragons");
		teamQueue.enqueue("Merry Men");
		teamQueue.enqueue("Flesh Wounds");
		teamQueue.enqueue("Williams Wallace");
		teamQueue.enqueue("Valhalla Bound");
		teamQueue.enqueue("The Knights Who Say \"Ni\"");
		
		System.out.println(teamQueue);
		System.out.println("Add Description \"Winter Teams\": ");
		teamQueue.enqueue("Winter Teams");
		
		System.out.println(teamQueue);
		
		
		System.out.println("Remove first two teams: ");
		teamQueue.dequeue();
		teamQueue.dequeue();
		
		System.out.println(teamQueue);
		
	}

}
