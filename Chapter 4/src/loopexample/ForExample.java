package loopexample;

public class ForExample {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		//��򰡿� ���ľ� �ϴ� �̰��� sum�̶�� �д�
		//��� ���� ���ؾ� �ϴ� ���� �ʱ�ȭ����� ��
		
		for(int i = 0;i < 10; i++, count++) {
			sum += count;	 
		//���⿡ �ᵵ �ǰ� ��ȣ�� ������ĭ�� �ᵵ ��, �� �� �ϳ��� �� ��	count++�� ��� ���� count �ʱ�ȭ �� ��� ��
			
					}
		//���� Ƚ���� �ǹ̷� �� ���� 0���� ��, �迭�� index�� 0���� ����
		System.out.println(sum);
				
		int num = 1;
		//while���� �ʱ�ȭ �ٱ����� ����
		int total = 0;
		
		while(num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);
		
		//for(;;){} >> for�� ���ѷ���, �ʿ信 ���� �ʱ�ȭ, ���� ���� ����
		//while(true)�� ���� �ǹ���
	}

}
