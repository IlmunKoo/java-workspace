package interfaceex;

public interface Calc {

	double PI = 3.14; // ����� �ȴ�
	int ERROR = -99999999; // integer���� �� ������� ���� �� ���� �� ���

	int add(int num1, int num2);

	int subtract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	// �������̽����� ����: ��õ� ��Ģ������ �϶�� ����, �̿� ���� �뷫���� ���� �����ϰ� ����

	// public String stringAdd(String s1, String s2) //�Լ��� �ñ״�ó ����������, ��ȯ�ڷ���
	// �Լ���(�Ű�����)

	default void description() { // �����
		System.out.println("���� ���⸦ �����մϴ�.");
		myMethod();
	}

	static int total(int[] arr) { // �������̽� Ÿ������ ������ ���� ����!, ���ϰ� ���� ��� �������̽��� static�޼��� ������ �ν��Ͻ� ���� ���ϰ� �� �� ����
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		mystaticMethod();  //static���� �Ϲݸ޼��� ȣ��Ұ�! static�� �ν��Ͻ� �������� �ʰ� �Ҹ��Ƿ�
		return total;
	}

	private void myMethod() { // �ڹ� 9���� ����(private method)
		System.out.println("privae method");
	}

	private static void mystaticMethod() {
		System.out.println("privae static method");

	}
}
