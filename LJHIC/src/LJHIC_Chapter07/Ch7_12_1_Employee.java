package LJHIC_Chapter07;

public class Ch7_12_1_Employee {
	protected String name;
	protected double salary;
	
	//생성자 선언
	public Ch7_12_1_Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//Employee의 이름, 급여 정보를 가져오기 위한 메소드
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	//급여 인상 처리를 위한 메소드
	public void raiseSalary() {
		this.salary = this.salary * 1.1;
	}
}









