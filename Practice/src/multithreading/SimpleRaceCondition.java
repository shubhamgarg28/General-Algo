package multithreading;


class Race {
	
	public static int num = 0;
	
	public void increase(){
		System.out.println("Increasing num");
		num++;
		try {
			wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void set() {
		num = 5;
	}
	
}



public class SimpleRaceCondition {
	
	public static void main(String[] args) {
		Race race = new Race();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i =0;
				while ( i < 100) {
					race.increase();
					i++;
				}
			
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i =0;
				while ( i < 100) {
					race.set();
					i++;
				}
				
				
				
			}
		});
		
		t1.start();
		t2.start();
	}
	
	

}
