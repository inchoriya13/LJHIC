package LJHIC_Chapter10;

public class Ch10_02_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		/*String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);*/
		
		int[] num = new int[3];
		for(int i=0; i<num.length; i++) {
			num[i] = i;
			
			System.out.println(num[i]);
		}

	}

}
