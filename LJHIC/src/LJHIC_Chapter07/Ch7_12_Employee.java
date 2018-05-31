package LJHIC_Chapter07;
	//A. 직원의 이름, 급여 정보를 가지고 있음
	//B. 급여 인상에 대한 메소드를 가짐(인상률은 10%)
public class Ch7_12_Employee {
	
	//필드 선언
	public String name;
	public int salary;
	
	//생성자 선언
	public Ch7_12_Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	//급여 인상 메소드 선언
	public int getSalary() {
		salary = (int)(salary * 1.1);
		return salary;
	}
	

		
}
