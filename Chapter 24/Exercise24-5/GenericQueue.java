/*
 * Author: Sierra Andersen
 * Date: 6 Feb 2023
 * 
 * This program creates a generic Queue by inheriting from the LinkedList class.
 */


import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {

	public void enqueue(E e) {
		addLast(e);
	};
	
	public E dequeue() {
		return removeFirst();
	}
	
}
