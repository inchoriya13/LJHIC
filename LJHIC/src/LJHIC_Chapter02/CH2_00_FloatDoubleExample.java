package LJHIC_Chapter02;

public class CH2_00_FloatDoubleExample {

	public static void main(String[] args) {

		/*
		 * 실수형 변수를 선언하는 타입 double(8byte), float(4byte)
		 * 자바는 기본 실수값을 double타입으로 인지하기 때문에 float타입의 변수에
		 * 실수를 담기 위해선 값의 끝에 F를 붙여야 함.
		 */
		
		double var1 = 3.14;
		//int var2 = 3.14;
		float var3 = 3.14f;
		
		int var6 = (int) 3e6;
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 455555555e-3;
		
		System.out.println("var1: " + "더 연결하면 "+ var1);
		System.out.println("var3: " +var3);
		System.out.println("var6: " +var6);
		System.out.println("var7: " +var7);
		System.out.println("var8: " +var8);
		System.out.println("var9: " +var9);
		
	}

}
