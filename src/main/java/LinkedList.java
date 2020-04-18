import java.security.NoSuchAlgorithmException;

public class LinkedList {

	private class Node{
		private int value;
		private Node next;
		Node(int val){
			value = val;
		}
	}
	
	private Node first;
	private Node last;
	
	public void addFirst(int item) {
		var node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else
		last.next=node;
		last = node;
	}
	
	public void addLast(int item) {
		var node = new Node(item);
		if(isEmpty()) {
			first = last = node;
		} else
		last.next= node;
		last = node;
	}
	
	private Node getPrevious(Node last2) {
		
		var index = first;
		
		while(index != null) {
			if(index.next==last2) {
				return index;
			}
			index = index.next;
		}
		return null;
	}

	public void deleteFirst() throws NoSuchAlgorithmException {
		
		if(isEmpty()) {
			throw new NoSuchAlgorithmException();
		}
		var second = first.next;
		first.next = null;
		first = second;
	}
	
	public void deleteLast() throws NoSuchAlgorithmException {
		if(isEmpty()) {
			throw new NoSuchAlgorithmException();
		}
		var node = getPrevious(last);
		last = node;
		node.next = null;
	}
	
	public int indexOf(int i) {
		var current = first;
		int index = 0;
		while(current !=null) {
			if(current.value == i) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	public boolean contains(int i) {
		return indexOf(i) != -1;
	}
	
	public String toString() {
		var index = first;
		StringBuilder string = new StringBuilder("[");
		while(index != null) {
			string.append(index.value);
			index = index.next;
			if(index != null)
			string.append(",");
		}
		string.append("]");
		return string.toString();
	}
	private boolean isEmpty() {
		return first == null;
	}
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		var list = new LinkedList();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.addLast(60);
		list.deleteFirst();
		list.deleteLast();
		System.out.println(list.indexOf(30));
		System.out.println(list.contains(200));
		System.out.println(list.toString());
	
	}

}
