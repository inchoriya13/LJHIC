package LJHIC_Chapter04;
//switch~case문 연습
public class CH4_06_SwitchExample {

	public static void main(String[] args) {
		//1~6사이의 난수 발생
		int num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1:	//num == 1인 경우
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:	 //num == 2인 경우
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:	 //num == 3인 경우
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:	 //num == 4인 경우
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:	 //num == 5인 경우
			System.out.println("5번이 나왔습니다.");
			break;
		default:  //else와 사용이 비슷, 주어진 조건 외에 값들
			System.out.println("6번이 나왔습니다.");
			break;
		}

	}

}
