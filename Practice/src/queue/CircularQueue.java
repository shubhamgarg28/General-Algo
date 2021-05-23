package queue;

import java.util.Scanner;

public class CircularQueue {
	
	int[] queue;
	int front, rear;
	
	public CircularQueue() {
		
		queue = new int[5];
		front = -1;
		rear = -1;
	}
	
	public boolean isEmpty() {
		if (front == (rear -1 )) {
			return true; 
		}
		return false;
	}
	
	public boolean isFull() {
		if ((rear + 1) % (queue.length) == front) {
			return true;
		}
		return false;
	}
	
	public void add(int num) throws Exception {
		
		if(isFull()) {
			throw new Exception("Full queue");
		} else {
			if (front == -1) {
				front = 0;
			}
			if (rear == queue.length -1) {
				rear = (rear + 1) % queue.length;
			} else {
			rear = rear + 1;
			}
			queue[rear] = num;
			
			
		}
	}
	
	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("empty");
		} else {
			int data =  queue[front];
			if (front == queue.length -1) {
				front = (front + 1) % queue.length;
			} else {
				front = front +1;
			}
			return data;
		}
	}
	
	public void printData() {
		utils.PrintingUtils.printArray(queue, "queue is => ");
		System.out.println("Front => " + front);
		System.out.println("Rear => " + rear);
	}

	public static void main(String[] args) throws Exception {
		CircularQueue queue = new CircularQueue();
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		while (cont) {
			System.out.println("1 to add");
			System.out.println("2 to print");
			System.out.println("3 to read");
			System.out.println("Enter value");
			int option = sc.nextInt();
			switch(option) {
			case 0:{
				cont = false;
				break;
			}
			case 1 : {
				System.out.println("Enter number to add");
				int num  = sc.nextInt();
				queue.add(num);
				break;
			}
			case 2: {
				System.out.println("removed element is => " + queue.remove());
				break;
			}
			
			case 3 : {
				queue.printData();
				break;
			}
			default: {
				continue;
			}
			}
		}
		

		
		
	  }
	}