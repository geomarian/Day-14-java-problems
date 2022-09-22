/**
 * 
 */
package com.bridgelabz;

import org.w3c.dom.Node;

/**
 * @author ASUS
 *
 */
public class LinkedListUC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  MyNode<Integer> myFirstNode = new MyNode<>(56);
		  MyNode<Integer> mySecondNode = new MyNode <>(30);
		  MyNode<Integer> myThirdNode = new MyNode<>(70);

	        //Linking the nodes
	        myFirstNode.setNext(mySecondNode);
	        mySecondNode.setNext(myThirdNode);

	        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
	        		mySecondNode.getNext().equals(myThirdNode);
	        
	       System.out.println(result);
	      
	    }
	}