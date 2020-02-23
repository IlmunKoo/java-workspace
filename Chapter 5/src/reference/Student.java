package reference;

public class Student {
//class 이름이 같아도 package가 다르면 전혀 다른 class가 됨
	
	int studentID;
	String studentName;
	//String은문자열 특성상 그대로 상수값을 가져다 쓸 수 있음
	
	
	Subject korea;
	Subject math;
	//but math, korea와 같은 다른 객체들은 생성해서 써야 함
	//참조자료형 타입으로 변수선언, 변수를 생성자에서 초기화
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		//초기화를 하고 써야 함>>생성자에서 많이 하는 편
				
		}
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		//subject에서 선언해놨던 것을 여기서 쓸 수 있음, 물론subject에서도 쓸 수 있음
		
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName +  "학생의 총점은" + total +"점입니다.");
	} // 이렇게 매서드를 만든 후 Test에서 매서드를 호출함
	
	
	//이렇게 하면 학생의 클래스인지, 점수 클래스인지 성격이 모호해짐>> 분리해줘야 더 깔끔
	
}
