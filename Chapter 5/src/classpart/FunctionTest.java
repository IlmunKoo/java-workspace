package classpart;

public class FunctionTest {
	
	public static int addNum(int num1, int num2) {
		//�ż��� �� �𸣰����� ������ ����, ����, �������� �� ��
		int result;
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}// void: ��ȯ�ϴ� ��(return)�� ���� ����ϰ� ��
	
	public static int calcSum() { //�Ű����� �ʿ� ���� return�� ����
		int sum = 0;
		int i;
		
		for(i = 0; i <= 100; i++) {
			sum += i;
			
		}
		return sum;
		
		//�Լ��� ȣ������� �۵��� ��
	}

	public static void main(String[] args) {
		// args(argument array): �Ű������� �Լ��� ����, ��������(�� ���������� ���)��� ��
		int n1 = 10;
		int n2 = 20;
		
		addNum(n1, n2);  //�̷��� n1=10, n2=20�� ���� ���� int num1 , int num2��  �Ѱ��ְ� ��
		int total = addNum(n1, n2); //int result = num1 + num2; �̹Ƿ� int�� �޾���� ��
		
		// int num = sayHello("�ȳ��ϼ���"); //void�̹Ƿ� �޴°��� �ƴ�! (return ����)
		sayHello("�ȳ��ϼ���");
		int num = calcSum();
		//�̷��� �Լ��� �̸��� �̿��ؼ� �Լ��� �θ��� ���� '�Լ��� ȣ���Ѵ�'��� ��
		//�Լ� ȣ��� ����ϴ� �޸�: stack�̶�� �θ�, �� ���� �Ʒ����� ����, ���� ���� ������ �Ʒ���
		//�Լ� ȣ���� ������ ���θ� ����, �ڵ����� �޸𸮰� ��ȯ�ȴ�
		//���������� �Լ��� ȣ��� ���� ���� ����, �Լ��� ȣ���� ������ �ڵ����� �����
		//�Լ� ȣ��� ���ø޸𸮰� ��� ��ȭ�ϴ��� �˾ƾ� ��
		System.out.println(total);
		System.out.println(num);
		
		
		

	}

}
