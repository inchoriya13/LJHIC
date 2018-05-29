package LJHIC_Chapter03;
//삼항연산자 예제
/*
 * 형식 → (조건식) ? 조건이 true일때의 결과 : 조건이 false일때의 결과
 */
public class CH3_11_ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println("당신의 성적은 " + grade + " 입니다.");
		
		int score1 = 98;
		char grade1 = (score1 > 90) ? 'A' : ((score1 > 80) ? 'B' : 'C');
		System.out.println("당신의 성적은 " + grade1 + " 입니다.");

	}

}
