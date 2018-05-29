package LJHIC_Chapter06;
import java.util.Scanner;
public class CH6_21_StudentMain {

	
	public static void main(String[] args) {
		
		// 1.Scanner를 이용하여 학생의 이름, 국어, 영어, 수학 성적을 입력함
		// 2.학생은 총 3명을 입력 받음
		// 3.각 학생의 평균 성적을 계산하여 출력하고
		// 4.3과목의 전체 합산 점수가 높은 순으로 등수를 출력
		
		Scanner scan = new Scanner(System.in);
				
		String[] sName= new String[3];
		
		int[] kScore = new int[3];
		int[] eScore = new int[3];
		int[] mScore = new int[3];
		int[] sum = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"번 학생의 이름을 입력하세요 : ");
			sName[i] = scan.next();
			System.out.print((i+1)+"번 학생의 국어점수를  입력하세요 : ");
			kScore[i] = scan.nextInt();
			System.out.print((i+1)+"번 학생의 영어점수를  입력하세요 : ");
			eScore[i] = scan.nextInt();
			System.out.print((i+1)+"번 학생의 수학점수를  입력하세요 : ");
			mScore[i] = scan.nextInt();
			sum[i] = kScore[i]+eScore[i]+mScore[i];
			}
			Ch6_21_Student stud0 =  new Ch6_21_Student();
			stud0.setName(sName[0]);
			stud0.setKorean(kScore[0]);
			stud0.setEnglish(eScore[0]);
			stud0.setMath(mScore[0]);
			stud0.result();

			Ch6_21_Student stud1 =  new Ch6_21_Student();
			stud0.setName(sName[1]);
			stud0.setKorean(kScore[1]);
			stud0.setEnglish(eScore[1]);
			stud0.setMath(mScore[1]);
			stud0.result();
			
			Ch6_21_Student stud2 =  new Ch6_21_Student();
			stud0.setName(sName[2]);
			stud0.setKorean(kScore[2]);
			stud0.setEnglish(eScore[2]);
			stud0.setMath(mScore[2]);
			stud0.result();
			
		}
		

		
		
	


}