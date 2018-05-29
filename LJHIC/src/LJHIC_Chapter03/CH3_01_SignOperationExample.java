package LJHIC_Chapter03;

public class CH3_01_SignOperationExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " +  result1);
		System.out.println("result2 = " +  result2);
		
		short s = 100;
		//short result = -s;	//(컴파일에러)short타입으로 연산불가, int 타입으로 연산가능
		int result3 = -s;
		System.out.println("result3 = " + result3);

	}

}