package object;

class Student {
	int studentNum;
	String studentName;
	
	//#������
	public Student(int studentNum, String studentName) { 
		this.studentNum = studentNum;  //this: ������� �ǹ�, �Ű������� ���� ���� ��������� ��� �ΰڴ�!!
		this.studentName = studentName;
	}

	//#equals �������̵�, ���ÿ� hashCode �������̵� ����� ��
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj; //Object�� ��� Ŭ������ �ֻ���Ŭ�����̹Ƿ�=> Student�� �ٿ�ĳ����!!, obj�� std�� ��ڴ�!, Student������ ���ǵ�   studentName�� StudentNum ��� ����
			
			// return (this.studentNum == std.studentNum); //this�� ����Ű�� ��?
			if (this.studentNum == std.studentNum)  //�ؽ��ڵ� �ڵ��� ����� �̿�!
				return true;
			else
				return false;
		}
		return false; // Student �ƴ� ���
        //�޸� �ּ� �޶� �������� ���� ��� ���ٰ� ó���ؾ� ����x
		//hashCode: �ν��Ͻ� ������ ���� �޸� �ּ�
	}

	@Override
	public int hashCode() {  //equals�� �� ��� Ȱ��,������ true�̹Ƿ� ������ ����
		return studentNum;
	}

	/*equals(): �� ��ü�� ������ ������ Ȯ���ϴ� Method :Object�� ���ǵ� equals�� �ܼ��� (this == obj)�� ��
	=>equals�� �������̵��ؼ� �ذ�
	hashCode(): �� ��ü�� ���� ��ü���� Ȯ���ϴ� Method
	=>hashCode()�� native call�� �Ͽ� Memory���� ���� �ؽ� �ּҰ��� ���
	Ư���� �������� ���� ��� System.identityHashCode()�� ������ �� ��Ÿ��
	*/
}

public class EqualsTest {

	public static void main(String[] args) {
		/*
		 * String str1 = new String("abc"); String str2 = new String("abc");
		 * 
		 * System.out.println(str1 == str2); // �� ���� �޸𸮰� �������� ���
		 * System.out.println(str1.equals(str2)); // �ΰ��� ���ڿ��� ������ �� // equals��
		 * ������(String ������ ��� ���ڿ� ������ ����!��� �ν�)
		 */

		/*
		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		// �� �� ���� �� �ּҰ� ����
		Student Shin = new Student(100, "�̼���");
		// �� �ּ� �ٸ����� ������ ����

		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin)); // ������ �ּҺ�! �츮�� �������� ���� �� �����ϰ� ����

		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
		*/
	
		Integer i1 = new Integer(100);
		Integer i2 = 100;   //�������� new �Ⱥٿ��൵ ��, �ν��Ͻ� �ٸ����� true
		
		//#equals�� hashcode �� �� �������̵�����
		System.out.println(i1.equals(i2));  //�� ��ü�� ���ٰ� ���� �� �� ��ü�� ��ȯ�ϴ� �ؽ��ڵ嵵 �����ϰ� �������̵��Ѵ�!
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		System.out.println(System.identityHashCode(i1)); //��ü�� ���� �ؽ��ڵ尪
		System.out.println(System.identityHashCode(i2)); //�� ���� ���� �޸𸮰��� �ٸ�  
	}
}

//��ü�� �����ϴ�: ���� �޸��ּ� �ٸ����� �������� ����: equals() ��ȯ�� true
//������ hashCode �� ���� ��
//�Ϲ������� equals �������̵��� hashCode�� �������̵���
