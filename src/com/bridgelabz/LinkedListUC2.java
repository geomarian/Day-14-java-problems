/**
 * 
 */
package com.bridgelabz;

import org.w3c.dom.Node;

/**
 * @author ASUS
 *
 */
public class LinkedListUC2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedListOperations operations = new LinkedListOperations();
	        INode head;

	        Node<Integer> myFirstNode = new Node<>(70);
	        Node<Integer> mySecondNode = new Node<>(30);
	        Node<Integer> myThirdNode = new Node<>(56);

	        head = operations.addNode(myFirstNode);
	        operations.displayNode(head);
	        head = operations.addNode(mySecondNode);
	        operations.displayNode(head);
	        head = operations.addNode(myThirdNode);
	        operations.displayNode(head);
	    }
	}
	
