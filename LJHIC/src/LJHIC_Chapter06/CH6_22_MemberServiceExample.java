package LJHIC_Chapter06;
import java.util.Scanner;
public class CH6_22_MemberServiceExample {

	public static void main(String[] args) {
		Ch6_22_MemberService mService = new Ch6_22_MemberService();
		
		Scanner scan = new Scanner(System.in);
		int sel=0;
		boolean run = true;
		String msid = null;
		String mspw = null;
		
		while(run) {
			
			System.out.println("수행할 서비스를 선택해 주세요.");
			System.out.println("1.로그인 || 2.로그아웃");
			System.out.print("선택 >> ");
			sel = scan.nextInt();
			
			switch(sel) {
			case(1):
				System.out.print("id를 입력하세요: ");
				msid = scan.next();
				System.out.print("pw를 입력하세요: ");
				mspw = scan.next();
				boolean result = mService.login(msid , mspw);
				
				if(result) {
					System.out.println(msid+"님 로그인 되었습니다.");
					
				} else {
					System.out.println("id 또는 password가 올바르지 않습니다.");
				}
						break;		
			case(2) :
				mService.logout(msid);
				run = false;
				
			} //switch{}
		
		} //while{}
		
	} //main{}
	
} //class{}

