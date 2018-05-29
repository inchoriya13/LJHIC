package LJHIC_Chapter06;

public class CH6_04_KoreanExample {

	public static void main(String[] args) {
		// 본인의 이름과 주민번호 앞자리로 k1, k2 객체를 각각 생성해서 필드갑을 출력해보세요.
		// 객체생성
		Ch6_04_Korean k1 = new Ch6_04_Korean("황인철","860710");
		Ch6_04_Korean k2 = new Ch6_04_Korean("이진희","880621");
		
		System.out.println("k1의 이름(name) : " + k1.name + "\tk1의 생년월일(ssn) : " + k1.ssn);
		System.out.println("k2의 이름(name) : " + k2.name + "\tk2의 생년월일(ssn) : " + k2.ssn);

	}

}
