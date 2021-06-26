package AnubhavStudy;

public class StaticClass {
	
	static int a = 10;
	int b;
	
	StaticClass(int b) {
		this.b = b;
	}
	
	void printA() {
		System.out.println(++a);
		System.out.println("Value of a is" + a);
		System.out.println(this.b);
	}
	
	void printB() {
		System.out.println(++a);
		System.out.println(b);
	}
	
	

	public static void main(String[] args) {
		
		StaticClass ob1 = new StaticClass(4);
		StaticClass ob2 = new StaticClass(5);
		System.out.println(a);
		ob1.printA(); //11 //4
		ob1.printB(); //12 //4
		ob2.printA(); //13 //5
		ob2.printB(); //14 //5
		

	}

}
