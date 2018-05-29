package LJHIC_Chapter05;

import java.util.Scanner;

public class CH5_13_ArrayExample6 {

	public static void main(String[] args) {
		String[][] words= {
				{"chair","의자"},
				{"desk","책상"},
				{"water","물"},
				{"monitor","모니터"},
				{"mouse","마우스"}
		};
		Scanner scan = new Scanner(System.in);
		int count=0;
		int i=0;
		
		for(i=0; i<words.length;i++) {
			for(int j=0; j<words[i].length;j++) {
				//System.out.println("words["+i+"]["+j+"] = " + words[i][j]);
				
			}
			System.out.print("문제"+(i+1)+". "+words[i][0]+"의 뜻은 무엇인가요? ");
			String ans = scan.next();
			if(ans.equals(words[i][1])) {
				System.out.println("정답입니다.");
				count++;
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("정답은 "+words[i][1]+" 입니다.");
			}
			
		}
		System.out.println("총 "+count+"개를 맞췄습니다.");
		System.out.println("정답률은 "+ ((double)count*100/i)+ "% 입니다.");
		
		scan.close();
	}

}
