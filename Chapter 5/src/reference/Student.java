package reference;

public class Student {
//class �̸��� ���Ƶ� package�� �ٸ��� ���� �ٸ� class�� ��
	
	int studentID;
	String studentName;
	//String�����ڿ� Ư���� �״�� ������� ������ �� �� ����
	
	
	Subject korea;
	Subject math;
	//but math, korea�� ���� �ٸ� ��ü���� �����ؼ� ��� ��
	//�����ڷ��� Ÿ������ ��������, ������ �����ڿ��� �ʱ�ȭ
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
		//�ʱ�ȭ�� �ϰ� ��� ��>>�����ڿ��� ���� �ϴ� ��
				
		}
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		//subject���� �����س��� ���� ���⼭ �� �� ����, ����subject������ �� �� ����
		
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName +  "�л��� ������" + total +"���Դϴ�.");
	} // �̷��� �ż��带 ���� �� Test���� �ż��带 ȣ����
	
	
	//�̷��� �ϸ� �л��� Ŭ��������, ���� Ŭ�������� ������ ��ȣ����>> �и������ �� ���
	
}