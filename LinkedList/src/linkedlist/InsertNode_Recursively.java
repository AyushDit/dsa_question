package linkedlist;

import java.util.Scanner;

public class InsertNode_Recursively {

	public static Node<Integer> insert(Node<Integer> head, int pos, int elem){
		if(pos == 0) {
			Node<Integer> newNode = new Node<>(elem);
			newNode.next = head;
			return newNode;
		}
		
		if(head == null)return head;
		
		head.next = insert(head.next, pos-1, elem);
		return head;
	}
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head = null, tail = null;
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
			    tail = newNode;
	     	}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		head = insert(head,2,10);
		print(head);

	}

}
