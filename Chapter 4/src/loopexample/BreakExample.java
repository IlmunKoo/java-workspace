package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int num;
		//�������� �ۿ���, �ʱ�ȭ�� for�� �ȿ��� �ؾ� ���� �� ����
		for(num =1; sum <= 100; num++) {
			sum += num;
			if( sum >= 100) break; //���ٰ� 100 �̻��� �Ǹ� �����!
			                       //�ϸ� �ٷ� ��������(����x)
			
				
		//����� num�̹Ƿ� int�� ���� ������ ����					
		}
		System.out.println(sum);
		System.out.println(num);
		//���������� for�� �ȿ��� ���� ��� for�� ���� �ν� ����(���������� ���ü�)
		//���� �ȿ����� ��ȿ��
		//num ���������� �ۿ���, �ʱ�ȭ�� ��ȣ �ȿ��� �ϸ� ��

	}

}