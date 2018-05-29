package LJHIC_Chapter03;

public class CH3_02_IncreaseDecreaseOperationExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------------------");
		x++; //x=11
		++x; //x=12
		System.out.println("x = " + x); //x=12
		
		System.out.println("--------------------------");
		y--; //y=9
		--y; //y=8
		System.out.println("y = " + y); //y=8
		
		System.out.println("--------------------------");
		z=x++; //z=12(x가 가지고 있는 값을 z에 대입 후 x값을 1증가시킴 **연산후대입**)
		System.out.println("z = " + z); //z=12
		System.out.println("x = " + x); //x=13
		
		System.out.println("--------------------------");
		z=++x; //z=14(x값을 1증가 시킨후 z에 대입 **대입후연산**)
		System.out.println("z = " + z); //z=14
		System.out.println("x = " + x); //x=14
		
		System.out.println("--------------------------");
		z = ++x + y++; //z=23 (x(=15)에 1을 증가시킨 값에 y(=8)값을 더해서 z에 대입)
		System.out.println("z = " + z); //z=23
		System.out.println("x = " + x); //x=15
		System.out.println("y = " + y); //y=9

	}

}
