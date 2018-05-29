package LJHIC_Chapter06;

public class CH6_05_CarExample3 {

	public static void main(String[] args) {
		// 기본생성자 객체 maCar0
		Ch6_05_Car myCar0 = new Ch6_05_Car();
		System.out.print("myCar0 ▷ 제조회사 : "+myCar0.company+"\t모델명 : " + myCar0.model + " \t색상 : " + myCar0.color);
		System.out.println("\t최고속도 : " +myCar0.maxSpeed +"\t현재속도 : " +myCar0.speed );
		
		Ch6_05_Car myCar1 = new Ch6_05_Car("matiz","pink");
		System.out.print("myCar1 ▷ 제조회사 : "+myCar1.company+"\t모델명 : " + myCar1.model + "\t색상 : " + myCar1.color);
		System.out.println("\t최고속도 : " +myCar1.maxSpeed );
		
		Ch6_05_Car myCar2 = new Ch6_05_Car("AudiTT","Blue",250);
		System.out.print("myCar2 ▷ 제조회사 : "+myCar2.company+"\t모델명 : " + myCar2.model + "\t색상 : " + myCar2.color);
		System.out.println("\t최고속도 : " +myCar2.maxSpeed );
		
		Ch6_05_Car myCar3 = new Ch6_05_Car("Genesis", 230, 60);
		System.out.print("myCar3 ▷ 제조회사 : "+myCar3.company+"\t모델명 : " + myCar3.model + "\t색상 : " + myCar3.color);
		System.out.println("\t최고속도 : " +myCar3.maxSpeed );
		
		System.out.print("myCar3 ▷ 제조회사 : "+myCar3.company+"\t모델명 : " + myCar3.model + "\t최고속도 : " + myCar3.maxSpeed);
		System.out.println("\t현재속도 : " +myCar3.speed );
		//myCar3으로 
		
		Ch6_05_Car myCar4 = new Ch6_05_Car("TIVOLI");
		System.out.print("myCar4 ▷ 제조회사 : "+myCar4.company+"\t모델명 : " + myCar4.model + " \t색상 : " + myCar4.color);
		System.out.println("\t최고속도 : " +myCar4.maxSpeed +"\t현재속도 : " +myCar4.speed );

	}

}
