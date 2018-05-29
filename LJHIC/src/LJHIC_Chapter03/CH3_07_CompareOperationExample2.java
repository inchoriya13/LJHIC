package LJHIC_Chapter03;

public class CH3_07_CompareOperationExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println("v2 == v3 : " + (v2 == v3)); //비교 연산시 v2가 double형으로 자동 형변환 후 수행
		
		double v4 = 0.1;
		float v5 = 0.1f; //0.1f는 근사치, 실제값은 0.100000000000000000234일수도
		System.out.println("v4 == v5 : " + (v4 == v5));
		System.out.println("(float)v4 == v5 : " + ((float)v4 == v5));
		System.out.println("(int)(v4*10) == (int)(v5*10) : " + ((int)(v4*10) == (int)(v5*10)));

	}

}
