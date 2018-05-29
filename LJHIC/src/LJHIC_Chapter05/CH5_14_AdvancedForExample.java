package LJHIC_Chapter05;

public class CH5_14_AdvancedForExample {

	public static void main(String[] args) {
		/*
		 * 향상된 for문(for~each문)
		 */
		
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		//for~each문
		//score는 반복을 위한 변수
		for(int score : scores) {
			sum += score;
			//System.out.println(score);
		}
		System.out.println("점수총합 : " + sum);
		System.out.println("점수평균 : " + (double)sum/scores.length);
	}

}
