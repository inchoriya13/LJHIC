package LJHIC_Chapter03;
//문자열 비교 연산 예제
public class CH3_08_StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "황인철";
		String strVar2 = "황인철";
		String strVar3 = new String("황인철");	//new 연산자 : 새로운 객체를 생성할때 사용하는 연산자
		//System.out.println("strVar1 : " + strVar1);
		//System.out.println("strVar2 : " + strVar2);
		//System.out.println("strVar3 : " + strVar3);
		System.out.println("strVar1 == strVar2 : " + (strVar1 == strVar2));
		System.out.println("strVar1 == strVar3 : " + (strVar1 == strVar3));
		System.out.println();
		System.out.println("strVar1.equals(strVar2) : " + strVar1.equals(strVar2));
		System.out.println("strVar1.equals(strVar3) : " + strVar1.equals(strVar3));
		// String에서는  == 비교연산자보다 (변수이름).equals(비교할변수이름)를 사용한다.
		// (변수이름).equals("비교할내용") 도 사용가능하다.
	}
}
