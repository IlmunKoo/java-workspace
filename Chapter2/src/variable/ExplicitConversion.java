package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i = 1000;
		byte bNum = (byte)i;
		//4����Ʈ(int)�� 1����Ʈ(byte)�� ���� ����, �׷��� �ְ������ ����� ����ȯbut ������ ���� ����
		// -128~127���� ǥ�������ϹǷ� ������ �߰� ��
		System.out.println(bNum);
		
		double dNum1 =1.2;
		float fNum = 0.9F;
	
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1);
		//�Ǽ��� ����ȭ�� ��� �Ҽ��� �Ʒ��� ����(����� �� ��ȯ), �� �������� ������ ���� ����
		//1
		System.out.println(iNum2);
	 	//2
		 
	}

}
