package LJHIC_Chapter03;

public class CH3_03_DenyLogicOperationExample {

	public static void main(String[] args) {
			boolean play = true;
			System.out.println(play);
			
			//자바에서 !의 의미는 NOT을 의미함.
			play = !play;	//play(true)의 반대 값을 play에 대입
			System.out.println(play);
			
			play = !play;	//다시play(false)의 반대 값을 play에 대입
			System.out.println(play);
	}

}
