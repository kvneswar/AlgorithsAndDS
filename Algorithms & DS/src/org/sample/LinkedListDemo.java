package org.sample;

public class LinkedListDemo {

    public static void main(String[] args) {

	LinkedList linkedList = new LinkedListDemo().new LinkedList();
	linkedList.inserAtHead(2);
	linkedList.inserAtHead(5);
	linkedList.inserAtHead(4);
	
	System.out.println(linkedList.find(10));
	linkedList.deleteAtHead();
	System.out.println(linkedList);
	System.out.println(linkedList.length());
	
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
    
    class LinkedList{
	
	private Node head;

	public void inserAtHead(int data){
	    Node newNode = new Node(data);
	    newNode.setNextNode(this.head);
	    this.head=newNode;
	}
	
	public void deleteAtHead(){
	    this.head = this.head.getNextNode();
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
	
	public int length(){
	    int length=0;
	    Node current = this.head;
	    while(current != null){
		length++;
		current = current.getNextNode();
	    }
	    return length;
	}
	
	public boolean find(int data){
	 
	    Node current = this.head;
	    while(current != null){
		if(current.getVal() == data){
		    return true;
		}
		current = current.getNextNode();
	    }
	    return false;
	}
	
    }
    
}
