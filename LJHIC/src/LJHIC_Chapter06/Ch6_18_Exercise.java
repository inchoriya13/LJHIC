package LJHIC_Chapter06;

public class Ch6_18_Exercise {
	//필드 선언
	public String name;
	public int assignmentScore;
	public int examScore;
	
	//메소드 선언
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAssignmentScore() {
		return assignmentScore;
	}
	
	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}
	
	
	public int getExamScore() {
		return examScore;
	}
	
	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	public String getGrade() {
		String grade = null;
		int avg = (this.assignmentScore + this.examScore)/2;
		
		if(avg >= 90) {
			grade = "A";
		} else if(avg >= 80) {
			grade = "B";
		} else {
			grade ="F";
		}
		return grade;
	}
	
	public void result() {
		System.out.println("이름  : " + this.name);
		System.out.println("과제 점수 : " + this.assignmentScore);
		System.out.println("시험 점수 : " + this.examScore);
		System.out.println("학점 : " + getGrade()+ "\n");
	}
	
}
