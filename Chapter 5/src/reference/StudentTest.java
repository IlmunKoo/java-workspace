package reference;

public class StudentTest {

	public static void main(String[] args) {
		//가져다 쓰는 방법? 일단 학생을 생성
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentLee.setKoreaSubject("국어", 80);
		studentLee.setMathSubject("수학", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		//매서드를 호출

	}

}
//나머지를 없애고 빨간줄 나오는 걸 하나하나 해결하며 복습