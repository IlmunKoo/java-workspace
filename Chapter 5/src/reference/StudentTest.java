package reference;

public class StudentTest {

	public static void main(String[] args) {
		//������ ���� ���? �ϴ� �л��� ����
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 95);
		
		
		Student studentKim = new Student(101, "Kim");
		studentLee.setKoreaSubject("����", 80);
		studentLee.setMathSubject("����", 99);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		//�ż��带 ȣ��

	}

}
//�������� ���ְ� ������ ������ �� �ϳ��ϳ� �ذ��ϸ� ����