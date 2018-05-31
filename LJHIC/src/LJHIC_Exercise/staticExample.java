package LJHIC_Exercise;

public class staticExample {
	
	int field1;
	void method1() { 
		System.out.println("method1 출력");	
		}
	
	static int field2;
	static void method2() {
		System.out.println("method2 출력");
	}
	
	static {
		//field1 = 10;
		field2 = 20;
		
		//method1();
		method2();
	}
	
	static void method3() {
		//this.field1 =10;
		field2 =20;
		
		//this.method1();
		method2();
	}
	
}
