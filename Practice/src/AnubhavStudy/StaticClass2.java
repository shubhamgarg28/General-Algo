package AnubhavStudy;

public class StaticClass2 extends StaticClass{

	StaticClass2(int b) {
		super(b);
		// TODO Auto-generated constructor stub
	}


	void printA() {
		System.out.println(++a);
		System.out.println("Value of a is" + a);
		System.out.println(this.b);
	}
	
	
	
}
