package LJHIC_Chapter07;

public class Ch7_12_Manager extends Ch7_12_Employee{
	public int bonus;
	
	public Ch7_12_Manager(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	public int getSalary() {
		salary = (int)(salary * 1.2 + bonus);
		return salary;
	}
}
