package classpart;

public class Student {
	//class �� ��ü�� û����: ��ü�� ��� ���� ��� but ��ü�� �Ӽ��� ���Ե����� ����> �����Ϸ��� ��ü �����ؼ� ��� ��
	public int studentID;
	//public>> ���� ������(access modifier), ���⼭�� �ᵵ �ǰ� �� �ᵵ �� 
	public String studentName;
	public String address;
	//��� ���� Ȥ�� �Ӽ��̶�� �Ҹ�-> ��
	// �л��� ������ ������>> ���: �޼���� ����
	
	public void showStudenInfo() {
	System.out.println(studentName + ","+ address);}
	
	public String getStudentName() {
		//void�� �ƴ϶� ��ȯ�� �ֱ� ������ string�� ���� ��
	return studentName;
	//�������(��Ʃ��Ʈ �̸�)�� ��ȯ�� �ִ� �޼��带 ����� ��
	
	}
	
	
	//void: ��ȯ�ϴ� ���� ������Ÿ��, ��ȯ�ϴ� ���� �ƹ��͵� ���� ���� void�� ���
	//�� �Լ��� ��� �Ű������� ���� ��ȯ���� ����, ��¸� �ϰ� �Ǿ� ����
	//�̸� Ŭ���� �ȿ� ����� �ż����� ��
	//�ż���: ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	//�ż��带 ���������ν� ��ü�� ����� ������
	//�ż����� �̸��� ����ϴ� ��(=Ŭ���̾�Ʈ �ڵ�)�� �°� �����ϴ� ���� ����
	//���񽺸� �����ϴ� ��: ���� �ڵ�, ���񽺸� ����ϴ� ��: Ŭ���̾�Ʈ �ڵ�
	//����/ �ż��� �̸��� �ҹ��ڷ� �����ؼ� camel case
	
	//�Ķ�����: Ŭ������ ���������� ���̴� ������� , ����� ����: �ż��� �ȿ��� ������ ����� ����
	//��������� new ���� �� heap�̶�� �޸𸮿� ����(���� �޸�)
	
	
	

}