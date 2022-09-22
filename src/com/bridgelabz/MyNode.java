/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class MyNode<T> {

	private T key;
	private MyNode next;
	
	public MyNode(T key) {
		this.key = null;
		this.next = null;
		
	}
	
	/**
	 * @return the next
	 */
	public MyNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(MyNode next) {
		this.next = next;
	}

	
}
