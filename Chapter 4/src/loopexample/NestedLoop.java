package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		
		// 2 X 3
		int dan = 2; //for�������� ���� �ȿ� �ʱ�ȭ�� ������ while������ �����Ƿ� ó���� ���� �� ��� ��
		int count = 1;
		
	/*	for( dan = 2; dan <= 9; dan++) {
			for(count = 1; count <= 9; count++) {
				System.out.println(dan + "X" + count + " = " +dan*count);
				
			}	
			System.out.println();
			
		} */
		
		while( dan <= 9) {
			count = 1;
			//�ʱ�ȭ �������
			while(count <= 9) {
				System.out.println(dan + "X" + count + " = " +dan*count);
				count++; //for�������� count++�� �־����� while�������� �����Ƿ� ���� �־���� ��
				 
				
			}
			dan++;  //count++�� �����ƶ�
			System.out.println();
			
			//�̷��� �ϸ� 2�ܱ����ۿ� �ȳ��� >> 2�� ������ count���� 10�϶� �ٽ�3�� �����Ϸ��� �ʱ�ȭ�� �Ǿ�� ��,
			//but �׷� ���� �����Ƿ� ���� ����
		}

	}

}