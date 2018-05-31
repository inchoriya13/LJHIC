package LJHIC_Chapter08;

public class Ch8_03_Example {

	public static void main(String[] args) {
		Ch8_03_ImplementationC impl = new Ch8_03_ImplementationC();
		
		Ch8_03_InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		Ch8_03_InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		Ch8_03_InterfaceA ic = impl;
		ic.methodA();
		//ic.methodB();
		//ic.methodC();
	}

}
