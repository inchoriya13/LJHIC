package LJHIC_Chapter10;

public class Ch10_04_TryCatchFinallyExmaple {

	public static void main(String[] args) {
	/*	try {
			String data = null;
			System.out.println("예외발생 전..");
			System.out.println(data.toString());
			System.out.println("예외발생 후..");
			System.out.println(data);
			
		} catch(NullPointerException e) {
			System.out.println("예외가 발생했으니 코드를 확인해보세요.");
			
		} finally {
			
		}*/
		int i =0;
		try {
			/*System.out.println("String data1 = args[0];");
			String data1 = args[0];
			System.out.println("String data2 = args[1];");
			String data2 = args[1];
			
			
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);*/
			
			int[] num = new int[3];
			for(i=0; i<=num.length; i++) {
				num[i] = i;
				
				System.out.println("["+i+"]번째 이후 예외발생");
				
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("["+i+"]번째 예외가 발생했으니 코드를 확인해보세요.");
		} finally {
			System.out.println("finally는 무조건 실행됩니다.");
		}
	}

}
