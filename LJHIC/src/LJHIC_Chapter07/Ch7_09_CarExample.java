package LJHIC_Chapter07;

public class Ch7_09_CarExample {

	public static void main(String[] args) {
		//car 객체생성
		Ch7_09_Car car = new Ch7_09_Car(); 
		
		Ch7_09_Tire tire1 = new Ch7_09_Tire("aaa",10);
		Ch7_09_HankookTire hktire1 = new Ch7_09_HankookTire("한국",10);
		
		tire1 = hktire1; //자식클래스 타입 변수를 부모클래스 타입 변수에 대입
		hktire1 = (Ch7_09_HankookTire) tire1; //부모클래스 타입 변수를 자식클래스 타입 변수에 대입
		//큰것이 작은것에 들어 갈 수 없는 원리..
		//tire1의 타입을 강제 타입 변환 (캐스팅)
		
		//Car객체의 run()메소드 5번 실행
		for(int i=1; i<=5; i++) {
			int porblemLocation = car.run();
		
		
		/*switch(porblemLocation) {
		case 1: //앞왼쪽 타이어가 펑크 났을때 HankookTire로 교체
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.frontLeftTire = new Ch7_09_HankookTire("앞왼쪽",15); 
			//Car클래스의 필드값을 HankookTire클래스의 필드값으로 재정의
			break;
		case 2: //앞왼쪽 타이어가 펑크 났을때 KumhoTire로 교체
			System.out.println("앞왼쪽 KumhoTire로 교체");
			car.frontRightTire = new Ch7_09_KumhoTire("앞오른쪽",13);
			//Car클래스의 필드값을 KumhoTire클래스의 필드값으로 재정의
			break;
		case 3: //앞왼쪽 타이어가 펑크 났을때 HankookTire로 교체
			System.out.println("앞왼쪽 HankookTire로 교체");
			car.backLeftTire = new Ch7_09_HankookTire("뒤왼쪽",14);
			//Car클래스의 필드값을 HankookTire클래스의 필드값으로 재정의
			break;
		case 4: //앞왼쪽 타이어가 펑크 났을때 HankookTire로 교체
			System.out.println("앞왼쪽 KumhoTire로 교체");
			car.backRightTire = new Ch7_09_KumhoTire("뒤오른쪽",17);
			//Car클래스의 필드값을 KumhoTire클래스의 필드값으로 재정의
			break;
		 }//switch
		System.out.println("-------------------------------------------"); //1회전시 출력되는 내용을 구분
	   }*/
			
			switch(porblemLocation) {
			case 1: //앞왼쪽 타이어가 펑크 났을때 HankookTire로 교체
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.tire[0] = new Ch7_09_HankookTire("앞왼쪽",15); 
				//Car클래스의 필드값을 HankookTire클래스의 필드값으로 재정의
				break;
			case 2: //앞왼쪽 타이어가 펑크 났을때 KumhoTire로 교체
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.tire[1] = new Ch7_09_KumhoTire("앞오른쪽",13);
				//Car클래스의 필드값을 KumhoTire클래스의 필드값으로 재정의
				break;
			case 3: //앞왼쪽 타이어가 펑크 났을때 HankookTire로 교체
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.tire[2] = new Ch7_09_HankookTire("뒤왼쪽",14);
				//Car클래스의 필드값을 HankookTire클래스의 필드값으로 재정의
				break;
			case 4: //앞왼쪽 타이어가 펑크 났을때 HankookTire로 교체
				System.out.println("앞왼쪽 KumhoTire로 교체");
				car.tire[3] = new Ch7_09_KumhoTire("뒤오른쪽",17);
				//Car클래스의 필드값을 KumhoTire클래스의 필드값으로 재정의
				break;
			 }//switch
			System.out.println("-------------------------------------------"); //1회전시 출력되는 내용을 구분
		   }
	}
}
