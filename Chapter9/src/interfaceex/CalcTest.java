package interfaceex;

public class CalcTest {
	public static void main(String[] args) {

		// CompleteCalc�ۿ� new �� �� �ִ� �� ����(�길 �Ϻ��ϰ� �������ֱ� ����)
		Calc calc = new CompleteCalc();
		// Calc�������̽� Ÿ��, Calculator�� ���� ����
		// ����� ��ĳ���ð� ���� ����, Ÿ�Կ� ���� �ż��� �� �� �ִ������� ����
		// �����ڵ� �����Ƿ� Ÿ�Ի���̶�� ����
		int n1 = 10;
		int n2 = 2;

		System.out.println(calc.add(n1, n2));
		System.out.println(calc.subtract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));

		calc.description();
		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = Calc.total(arr); // �ν��Ͻ� ������ ������ ���� ���� �ƴ� �������̽�Ÿ������ ������ ��(�빮��)
		System.out.println(sum);   //�ν��Ͻ� ���� ���� �ٷ� ������ �� �� �ִ�!
	}
}
