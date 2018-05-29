package LJHIC_Chapter04;

public class CH4_07_SwitchCharExample {

	public static void main(String[] args) {
		//char grade='B';
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("부장 입니다.");
		case "과장":
			System.out.println("과장 입니다.");
			break;
		default:
			System.out.println("사원 입니다.");
		}

	}

}
