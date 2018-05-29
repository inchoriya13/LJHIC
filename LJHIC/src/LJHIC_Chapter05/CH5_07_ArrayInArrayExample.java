package LJHIC_Chapter05;

public class CH5_07_ArrayInArrayExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i=0;i<mathScores.length;i++) {
			for(int k=0;k<mathScores[i].length;k++) {
				System.out.println("mathScores["+i+"]["+k+"] = "+mathScores[i][k]);
			}
		}System.out.println("");
		
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0;i<englishScores.length;i++) {
			for(int k=0;k<englishScores[i].length;k++) {
				System.out.println("englishScores["+i+"]["+k+"] = "+englishScores[i][k]);
			}
		}System.out.println("");
		
		int[][] javaScores = {{10,22,33},{44,55,6}};
		System.out.println(javaScores);

	}

}
