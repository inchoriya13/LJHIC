package LJHIC_Chapter07;

public class Ch7_02_Student extends Ch7_02_people{
	//필드 선언
	public int studentNo;
	
	//생성자 선언
	public Ch7_02_Student(String name, String ssn, int studentNo){
		//this.name = name;
		//this.ssn = ssn;
		super(name,ssn); //부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
		this.studentNo = studentNo;
	}
	//클래스 추가
	//Student 자식클래스
	//StudentNo 필드
	//name, ssn, studentNo 매개로 하는 생성자
}
