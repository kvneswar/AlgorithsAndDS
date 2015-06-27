package org.sample;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
	
	DublyLinkedList doublyLinkedList = new DoublyLinkedListDemo().new DublyLinkedList();
	doublyLinkedList.insertAtHead(2);
	doublyLinkedList.insertAtHead(5);
	System.out.println(doublyLinkedList);
	System.out.println(doublyLinkedList.length());
    }
    
    
    class DublyLinkedList{
	
	private DoublyLinkedNode head;
	
	public void insertAtHead(int data){
	    DoublyLinkedNode newNode = new DoublyLinkedNode(data);
	    newNode.setNextNode(this.head);
	    if(this.head != null){
		this.head.setPreviousNode(newNode);
	    }
	    this.head = newNode;
	}
	
	public int length(){
	    if(this.head==null){
		return 0;
	    }
	    int length=0;
	    DoublyLinkedNode current=this.head;
	    
	    while(current != null){
		length +=1;
		current = current.getNextNode();
	    }
	    return length;
	}
	
	@Override
	public String toString() {
	    String string = new String();
	    DoublyLinkedNode doublyLinkedNode = this.head;
	    while(doublyLinkedNode != null){
		string += doublyLinkedNode.getData()+",";
		doublyLinkedNode = doublyLinkedNode.getNextNode();
	    }
	    return string;
	}
	
    }
    
    
    class DoublyLinkedNode{
	
	    private int data;
	    private DoublyLinkedNode nextNode;
	    private DoublyLinkedNode previousNode;
	    
	    
	    public DoublyLinkedNode(int data){
		this.data=data;
	    }
	    
	    public int getData() {
	        return data;
	    }
	    
	    public void setData(int data) {
	        this.data = data;
	    }
	    
	    public DoublyLinkedNode getNextNode() {
	        return nextNode;
	    }
	    
	    public void setNextNode(DoublyLinkedNode nextNode) {
	        this.nextNode = nextNode;
	    }
	    
	    public DoublyLinkedNode getPreviousNode() {
	        return previousNode;
	    }
	    
	    public void setPreviousNode(DoublyLinkedNode previousNode) {
	        this.previousNode = previousNode;
	    }
	    
	    @Override
	    public String toString() {
		String str = "{";
		DoublyLinkedNode current = this.nextNode;
		while(current != null){
		    str += current.getNextNode()+", ";
		    current=current.getNextNode();
		}
		str += "}";
		return str;
	    }
	
    }
    

}
