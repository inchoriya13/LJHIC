package LJHIC_Chapter05;

public class CH5_06_ArrayCreateByNewExample {

	public static void main(String[] args) {
		int scores[] = new int[5]; 	//총 5개의 값을 담을 수 있는 배열 변수 scores 선언
			System.out.println(scores[0]);
		
		int[] arr1 = new int[3];
		for(int i=0;i<3;i++) {
			System.out.println("arr1[" + i +"] : " + arr1[i]);
		}
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		for(int i=0;i<3;i++) {
			System.out.println("arr1[" + i +"] : " + arr1[i]);
		}
		System.out.println("");
		double[]arr2 = new double[3];
		for(int i=0; i<3;i++) {
			System.out.println("arr2[" + i +"] : " + arr2[i]);
		}
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		for(int i=0; i<3;i++) {
			System.out.println("arr2[" + i +"] : " + arr2[i]);
		}
		System.out.println("");
		String[] arr3 = new String[3];
		for(int i=0; i<3;i++) {
			System.out.println("arr3[" + i +"] : " + arr3[i]);
		}
		arr3[0]="1월";
		arr3[1]="2월";
		arr3[2]="3월";
		for(int i=0; i<3;i++) {
			System.out.println("arr3[" + i +"] : " + arr3[i]);
		

	}System.out.println("");

}
}
