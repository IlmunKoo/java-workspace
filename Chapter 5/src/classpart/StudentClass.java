package classpart;

public class StudentClass {

	public static void main(String[] args) {
		//Ŭ������ ������ ���� ��찡 ��κ�
		//�������� ������ standalone���� ���⼭ �������� ��
		Student studentlee = new Student();
		//Student��� Ŭ���� �̸����� ��������, new�� �����Ѵٴ� �ǹ�, Student:Ŭ���� �̸��� ����
		//Student ���� ������ ��� Heap(���̳��� �޸�, ���� �޸�)�� ����
		//studentlee�� stack�� ����, �̴� heap�� instance�� ��ġ�� ����Ű�� ��
		//������ instance�� ������ �޸𸮸� ���´�
		
		//�޸𸮿� Ŭ���� ����
		studentlee.studentName = "�̼���";
		studentlee.address = "����";
		//���⼭ address�� �޼���
		studentlee.showStudenInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudenInfo();
		
		
		System.out.println(studentlee);
		System.out.println(studentKim);
		//studentlee�� stack���� ��
		//�ڹ� ���� �ϳ��� ���� ���� Ŭ���� ���� ����, but publicŬ������ �ϳ�, pulic class�̸� = �ڹ� ���� �̸��̾�� ��
		//classpart.Student@15db9742 >>�� ���� �� �����, ����Ű �̸�.Ŭ���� �̸�@�ּҰ�(Heap�� instance�ּ�), ���� �ּҰ�
	    //�������� ��½� ���� ���� �������� ���	
		//��������� �ΰ���: 
		//������ ���� ������ �ִ� Student �� StudentClass�� �и��ϰų� ������ ���� �κ��� ������ �ؿ� �־��ִ� ���

	}

}
