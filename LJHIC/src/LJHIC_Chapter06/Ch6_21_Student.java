package LJHIC_Chapter06;

public class Ch6_21_Student {
	//StudentMain 클래스에서 출력해야 하는 내용을 처리하는 메소드 등을 정의하시오
	//필드 선언
		private String name;
		private int korean;
		private int english;
		private int math;
		
		
		
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getKorean() {
			return korean;
		}



		public void setKorean(int korean) {
			this.korean = korean;
		}



		public int getEnglish() {
			return english;
		}



		public void setEnglish(int english) {
			this.english = english;
		}



		public int getMath() {
			return math;
		}



		public void setMath(int math) {
			this.math = math;
		}



		public void result() {
			System.out.println("이름  : " + this.name);
			System.out.println("국어점수 : " + this.korean);
			System.out.println("영어어점수 : " + this.english);
			System.out.println("수학점수 : " + this.math);
		}
}
