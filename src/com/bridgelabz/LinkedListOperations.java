/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class LinkedListOperations {

	private INode head;

    public INode addNode(INode myNode) {
        if (head == null)
            head = myNode;
        else {
            INode temp = head;
            head = myNode;
            head.setNext(temp);
        }
        return head;
    }
    public void displayNode(INode head) {
        System.out.println(head.getKey());
    }
}