package LJHIC_Chapter05;

public class CH5_12_ArrayExample5 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열을 사용하여 평점 계산하기
		 */
		
		double score[][]= {{3.3 , 3.4}, 
							{3.5 , 3.8} , 
							{4.2 , 4.3} , 
							{3.9 , 4.0}};
		
		double sum = 0;
		int count = 0;
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				sum += score[i][j];
				System.out.println("score["+i+"]["+j+"] = " + score[i][j]);
				count++;
			}
		}
		
		double avg = sum/(count);
		System.out.println("sum = " + sum);
		System.out.println("count = " + count);
		System.out.println("avg = " + avg);
	}

}
