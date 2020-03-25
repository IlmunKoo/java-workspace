package exercise;

//#Student Ŭ���� : ������, equals �������̵�, hashCode�������̵�
class Student {
	int studentNum;
	String studentName; // ��ȣ ������ �޼���, ��ȣ �Ⱥ����� �������

	Student(int StudentNum, String StudentName) {
		this.studentName = StudentName;
		this.studentNum = StudentNum;
	}

	@Override
	public boolean equals(Object obj) { // ������ �ٸ����� true, false�� �̿��ؼ� ǥ��
		if (obj instanceof Student) {
			// instanceof: ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� instanceof �����ڸ� ���
			// true �� ��ȯ���� �� ���������� ��ȯ�� ������ ����ȯ �����ϴٴ� ��!!
			Student std = (Student) obj; // �ٿ�ĳ�������� �� �ν��Ͻ��� ���� ������
			if (this.studentNum == std.studentNum) // this: ������� �ǹ�, Student�����ڸ� ���� �Ű������� ���� �� ��Ī, std: equals�� ���� �Ű�������
													// ���� �� �ǹ�
				return true;
			else
				return false;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return studentNum;

	}

}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "�̼���");
		Student Shin = new Student(100, "�̼���");

		System.out.println(Lee.equals(Shin));
		System.out.println(Shin);
		System.out.println(Lee.hashCode());  //equals ���� ���ٸ� hashCode���� ���ƾ� ��
		System.out.println(Shin.hashCode());
		
		System.out.println(System.identityHashCode(Lee)); //���� �ؽ��ڵ� �ּҰ�
		System.out.println(System.identityHashCode(Shin));

	}

}
