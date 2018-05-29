package LJHIC_Chapter07;

public class Ch7_09_Car {
	//필드 : Tire의 필드값 선언
	/*Ch7_09_Tire frontLeftTire = new Ch7_09_Tire("앞왼쪽" , 6);
	Ch7_09_Tire frontRightTire = new Ch7_09_Tire("앞오른쪽" , 2);
	Ch7_09_Tire backLeftTire = new Ch7_09_Tire("뒤왼쪽" , 3);
	Ch7_09_Tire backRightTire = new Ch7_09_Tire("뒤오른쪽" , 4);*/
	
	//위의 내용을 배열로
	//Tire클래스 타입의 배열 변수를 선언해서 우변에 있는 내용을 각각 배열 변수에 대입
	Ch7_09_Tire[] tire = { new Ch7_09_Tire("앞왼쪽" , 6),
						   new Ch7_09_Tire("앞오른쪽" , 2),
						   new Ch7_09_Tire("뒤왼쪽" , 3),
						   new Ch7_09_Tire("뒤오른쪽" , 4) };
	
	//생성자
	
	//메소드 : 필드값에 따른 메소드 정의 → roll()은 accumulatedRotation<maxRotation 일때 true의 값을 , 아닐시 false의 값을
	//반환하여 run()메소드를 실행 시키고 각각 1(FL),2(FR),3(BL),4(BR) 그리고 0(종료)의 숫자를 반환한다.
/*	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}//run()
*/	
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		for(int i=0;i<tire.length;i++) {
			if(tire[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		
		return 0;
	}//run()
	
	void stop() { //run()메소드에 호출되어 메세지를 출력한다
		System.out.println("[자동차가 멈춥니다.]");
	}
}
