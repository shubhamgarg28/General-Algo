package multithreading;


class PrintNumber {
	
	public static int num;
	private int counter =1;
	
	public void printEven() {
		
		while(counter <= num) {
			
			if (counter % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(counter);
			counter++;
			notify();
			
			
			
		}
		
	}
	
	
public void printOdd() {
		
		while(counter <= num) {
			
			if (counter % 2 == 1) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(counter);
			counter++;
			notify();
			
			
		}
		
	}
	
}




public class TwoThreadPrintingNumbers {
	

	public static void main(String[] args) {
		PrintNumber.num = 10;
		
		PrintNumber pn = new PrintNumber();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pn.printOdd();
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				pn.printEven();
				
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
