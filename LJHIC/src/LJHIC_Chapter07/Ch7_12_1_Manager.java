package LJHIC_Chapter07;

public class Ch7_12_1_Manager extends Ch7_12_1_Employee{
	protected double bonus;
	
	public Ch7_12_1_Manager(String name, double salary, double bonus) {
		super(name,salary);
		this.bonus = bonus;
	}
	
	public double getBonus() {
		return bonus;
	}
	
	//급여인상을 위한 메소드
	//@Override
	
	
}
