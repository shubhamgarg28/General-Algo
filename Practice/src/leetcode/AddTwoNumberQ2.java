package leetcode;

import java.util.Scanner;

import linkedList.SinglyLinkedList;

public class AddTwoNumberQ2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();
		
		SinglyLinkedList ll1 = new SinglyLinkedList();
		while(num1 != 0) {
			ll1.addInStart(num1%10);
			num1 = num1 / 10;
		}
		
		SinglyLinkedList ll2 = new SinglyLinkedList();
		while(num2 != 0) {
			ll2.addInStart(num2%10);
			num2 = num2 / 10;
		}
		
		SinglyLinkedList output = new SinglyLinkedList();
		
		while (ll1.head != null || ll2.head != null) {
			
			output.addAtEnd(ll1.head.data + ll2.head.data);
			ll1.head = ll1.head.next;
			ll2.head = ll2.head.next;
		}
		
		output.printLL();
		

	}

}
