package LJHIC_Chapter03;

import java.util.Scanner;

public class CH3_12_ScannerExample {

	public static void main(String[] args) {
/*
 * next() : 문자열 입력
 * nextInt() : 정수입력
 * nextDouble() : 실수 입력
 * close() : 스캐너 종료
 */
		/*Scanner hic = new Scanner(System.in);
		//현재 프로그램에서 scan이라는 이름으로 Scanner 기능을 사용하겠다는 의미
		System.out.println("이름을 입력해주세요 : ");;
		String name = hic.next();
		System.out.println("당신의 이름은 " + name + " 입니다.");*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중을 빈칸으로 분리하여 입력하세요");;
		String name = scan.next();
		String city = scan.next();
		int age = scan.nextInt();
		Double weight = scan.nextDouble();
		System.out.println("당신의 이름은 " + name + " 입니다.");
		System.out.println("당신이 사는 도시는 " + city  + "시 입니다.");
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		System.out.println("당신의 체중은 " + weight + "Kg 입니다.");
		scan.close();
	}

}