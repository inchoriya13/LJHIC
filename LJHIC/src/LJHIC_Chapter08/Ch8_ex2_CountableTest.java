package LJHIC_Chapter08;

public class Ch8_ex2_CountableTest {

	public static void main(String[] args) {
		Ch8_ex2_Countable[] m = {  new Ch8_ex2_Bird("뻐꾸기"),
								   new Ch8_ex2_Bird("독수리"),
								   new Ch8_ex2_Tree("사과나무"),
								   new Ch8_ex2_Tree("버드나무")  };
		/*
		 *  m[0] = Ch8_ex2_Bird("뻐꾸기")
		 *  m[1] = new Ch8_ex2_Bird("독수리")
		 *  m[2] = Ch8_ex2_Tree("사과나무")
		 *  m[3] = new Ch8_ex2_Tree("버드나무")
		 *  
		 *  m이라는 인터페이스 타입의 변수에 여러타입의 객체를 넣어서 생성
		 */
		
	for(Ch8_ex2_Countable e : m) {//for-each 문
		/*
		 * 첫번째 반복문
		 * e=m[0]
		 *  =new Ch8_ex2_Bird("뻐꾸기")
		 *  뻐꾸기를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
		 *  
		 * e=m[1]
		 *  =new Ch8_ex2_Bird("독수리")
		 *  독수리를 매개변수로 하는 Bird의 객체를 생성해서 e에 대입
		 */
		e.count(); //뻐꾸기가 2마리 있다.
	}
	
	for(int i=0; i<m.length;i++) {
		//타입에 따라 fly() 또는 rippen() 호출 => instanceof 사용
		//조건물을 이용해서 배열에 저장된 각 요소가 Bird 클래스 타입인지 확인
		if(m[i] instanceof Ch8_ex2_Bird) {
			((Ch8_ex2_Bird) m[i]).fly(); //Bird타입이 맞다면 강제 형변환을 시켜 호출
		} else {
			((Ch8_ex2_Tree) m[i]).rippen();
		}
		
		//타입에 따라 fly() 또는 rippen() 메서드를 호출
			/*if(i<=1) {
				((Ch8_ex2_Bird) m[i]).fly();
			} else if(i<=3) {
				((Ch8_ex2_Tree) m[i]).rippen();
			}*/
		
		
	}

	}

}
