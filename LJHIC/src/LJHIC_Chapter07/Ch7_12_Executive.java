package LJHIC_Chapter07;


public class Ch7_12_Executive extends Ch7_12_Manager{
	public boolean stock;
	
	public Ch7_12_Executive(String name, int salary, int bonus, boolean stock) {
		super(name, salary, bonus);
		this.stock = stock;
	}
	
	public int getSalary() {
		salary = (int)(salary * 1.3 + bonus);
		return salary;
	}
	
	public String isStock() {
		if(stock) {
			return "유";
		}
		return "무";
	}
}
