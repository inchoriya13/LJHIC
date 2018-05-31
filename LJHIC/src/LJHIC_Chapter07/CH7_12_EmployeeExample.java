package LJHIC_Chapter07;

public class CH7_12_EmployeeExample {

	public static void main(String[] args) {
		Ch7_12_Employee emp = new Ch7_12_Employee("양기두" , 2000000);
		Ch7_12_Manager mana = new Ch7_12_Manager("이진희" , 3000000, 1000000);
		Ch7_12_Executive exec = new Ch7_12_Executive("황인철", 5000000, 2000000, false);
		
		
		System.out.println("사원 " + emp.name + " >> 급여: " + emp.salary+ "원\t 인상된 급여: " + emp.getSalary() + "원");
		System.out.println("대리 " + mana.name + " >> 급여: " + mana.salary + "원\t 인상된 급여: " + mana.getSalary()+ "원\t 보너스: "+ mana.bonus + "원" );
		System.out.println("부장 " + exec.name + " >> 급여: " + exec.salary + "원\t 인상된 급여: " + exec.getSalary()+ "원\t 보너스: "+ exec.bonus + "원\t\t스톡옵션 여부: " + exec.isStock() );
	}

}
