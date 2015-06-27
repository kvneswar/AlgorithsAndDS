package org.sample;

import org.sample.LinkedListDemo.Node;

public class DoublyEndedLinkedDemo {

    public static void main(String[] args) {

	DoublyEndedList doublyEndedList = new DoublyEndedLinkedDemo().new DoublyEndedList();
	doublyEndedList.insertAtTail(5);
	doublyEndedList.insertAtTail(15);
	doublyEndedList.insertAtTail(25);
	System.out.println(doublyEndedList);
	
    }
    
    class DoublyEndedList{
	private Node head;
	private Node tail;
	
	public void insertAtTail(int data){
	    Node newNode = new Node(data);
	    if(this.head == null){
		this.head = newNode;
	    }
	    
	    if(this.tail != null){
		this.tail.setNextNode(newNode);
	    }
	    this.tail = newNode;
	}
	
	@Override
	public String toString() {
	    String result="{";
	    Node current = this.head;
	    while(current != null){
		result += current.toString() + ",";
		current = current.getNextNode();
	    }
	    result += "}";
	    return result;
	}
    }
    
    
    class Node{

  	private int data;
  	private Node nextNode;
  	
  	Node(int data){
  	    this.data = data;
  	}

  	public Node getNextNode() {
  	    return nextNode;
  	}

  	public void setNextNode(Node node) {
  	    this.nextNode = node;
  	}

  	public int getVal() {
  	    return data;
  	}

  	public void setVal(int data) {
  	    this.data = data;
  	}
  	
  	@Override
  	public String toString() {
  	    return this.data+"";
  	}
  	
      }

}
