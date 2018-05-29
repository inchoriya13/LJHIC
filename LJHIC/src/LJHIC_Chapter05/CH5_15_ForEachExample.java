package LJHIC_Chapter05;

public class CH5_15_ForEachExample {

	public static void main(String[] args) {
		int[] scores = {1, 2, 3, 4, 5};
		String[] fruits = {"사과","배","바나나","체리","딸기","포도"};
		int sum = 0;
		
		for(int score : scores) {
			sum += score;
			System.out.print(score+" ");
		}System.out.println("합은 " + sum);
		
		
		for(String fruit : fruits) {
			System.out.print(fruit+"  ");
		}
		
	}

}
