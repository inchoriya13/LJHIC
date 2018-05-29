package LJHIC_Chapter04;
//중첩 for문을 이용한 구구한 출력하기
public class CH4_11_ForMultiplicationTableExample {

	public static void main(String[] args) {
		//구구단 출력하기
		
			
			for(int i=1; i<=9; i++) {
				for(int j=1;j<=9;j++) {
				System.out.print(j + " X " + i + " = " + j*i + "\t");
			}System.out.println("");
		}

	}

}
