package linklist;
public class LinkedList {
	private class Node {
		private int value;
		private Node next;
		public Node(int value) {
			this.value=value;
		}
		}
	private Node first;
	private Node last;
	public void addlast(int item) {
		Node node=new Node(item);
		if(isEmpty()) {
			first=last=node;
		}
		else {
	last.next=node;
	last=node;
		}	}
	public void addfirst(int item) {
		Node node=new Node(item);
		if(isEmpty()) {
			first=last=node;
		}
		else {
	node.next=node;
	last=node;
		}}
	private boolean isEmpty() {
		return first==null;
	}
	public void printList() {
        Node current = first;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
	public int indexof(int item) {
		int index=0;
		Node current=first;
		while(current!=null) {
			if(current.value==item) return index;
			current=current.next;
			index++;
		}
		return -1;
	}

}
