package LJHIC_Chapter03;


import java.util.Scanner;

public class CH3_sugarEx {

		
		public static void main(String[] args) {
					
			Scanner scan = new Scanner(System.in);
			
			int kg = scan.nextInt();				
			int i =0;
			int a = kg/5;
			int b = (kg-(a*5));
			int c = b/3;
			
			
			
			if(b%3 == 0) {
				int val1 = a+c;
				System.out.println("5kg = " + a);
				System.out.println("3kg = " + c);
				System.out.println("val1 = " + val1);
			}else if(kg%3==0){
					int val2 = kg/3;
					System.out.println("5kg = 0" );
					System.out.println("3kg = " + val2);
					System.out.println("val2 = " + val2);
			
			}else if(kg==1 || kg==2 || kg==4 || kg==7 || kg==17) {
				System.out.println("-1");
		}else if(b%3 !=0) {
				if(b%3 !=0 && kg%3!=0){
					for(i=0; i<=kg/5; i++) {
						if((kg-i*5)%3!=0){
							continue;
						}
						
						int d = (kg - i*5)/3;
						int val3 = i+d;
						System.out.println("5kg = " + i);
						System.out.println("3kg = " + d);
						System.out.println("val3 = " + val3);
						
						}	
				
		    }

			}else {
				System.out.println("-1");
			}
			scan.close();
			}
}
