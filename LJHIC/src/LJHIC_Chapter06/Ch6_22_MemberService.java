package LJHIC_Chapter06;

public class Ch6_22_MemberService {
	static final String mid="yourid";
	static final String mpw="12345";
	
	boolean login(String id, String pw) {
		if(id.equals(mid) && pw.equals(mpw)) {
			return true;
		} else {
			return false;
		}
	}
		
	String logout(String msid) {
		
		System.out.println(msid+"님 로그아웃 되었습니다.");
		return msid;
	}
	
}
