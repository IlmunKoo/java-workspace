package cooperation;

public class Student {
	String studentName;
	int grade;
	int money;
	
	
	//�ʱ�ȭ ���� constructor �ϳ� ����
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
		
	}
	//��ü�� ������ ������ �κ�: ��ü(bus)�� �ް� �� ��ü�� �޼��� ȣ��, take�� ������ �޼���
	public void takeBus(Bus bus) {
		//������ Ÿ�� 1000�� ����
		bus.take(1000);
		//�׷��� �� ���� 1000�� ����
		this.money-= 1000;
		
	}
	//���������� ���� ������ �κ�
	public void takeSubway(Subway subway) {
		subway.take(1200);
		//�ڱ��� ���� ����
		this.money -=1200;
		
	}
	
	
	
	//���� �󸶳� ���Ҵ��� ���
	public void showInfo() {
		System.out.println(studentName +"���� ���� ���� " + money +"�� �Դϴ�.");
		
	}

}
