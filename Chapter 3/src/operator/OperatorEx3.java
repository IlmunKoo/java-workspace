package operator;

public class OperatorEx3 {

	public static void main(String[] args) {
		
		int num1 = 0B000001010; //10
		int num2 = 0B000000101; //5
		
		//�Ѵ� 1�� �κ��� ����>> ���ϸ� 0
		
		//��Ʈ�������� ��
		System.out.println(num1 & num2);
		//and
		System.out.println(num1 | num2);
		//or
		
		System.out.println(num1 ^ num2);
		// Exclusive or : �� ���� ��Ʈ�� ���� �ٸ� ��쿡�� 1�� ��ȯ
		
		System.out.println(num2 << 1);
		//num2�� ��ĭ�� ������ �и� num1�� �Ȱ��� ��(10), 5*2
		System.out.println(num2 << 2);
		//5*2�� 2�� >> 20
		System.out.println(num2 << 3);
		//5*2�� 3�� >>40
		//but num2�� ������ �δٰ� �ؼ� num2 ��ü�� �ٲ����� ����
		//num2�� �ٲٷ��� ���Կ�����= �� ���� �� ��� ��
		System.out.println(num2 <<= 3);
		System.out.println(num2 >> 2);
		
		// 0B000000101 ���⼭ ��ĭ ���������� �и� 1�� ����
		
  
	}

}
