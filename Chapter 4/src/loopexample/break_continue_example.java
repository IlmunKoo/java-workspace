package loopexample;

public class break_continue_example {

	public static void main(String[] args) {
		
		int num;
		int dan;
		
		for(dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) continue;
				//�� ���� ¦������ �ƴϸ� ���� for���ǹ����� �� ����
			// ¦������ ��� ���� for������ ���� �� ���� >>¦���� ���
			
			for(num = 1; num <= 9; num++) {
			
				if(num >= dan) break;// �������� ���� �ؿ����� �� �ٸ�, break�ϸ� �ڽ��� ���� ������ ��������
				//���������� ���� ������ �̵�
				System.out.println(dan + "X" + num +"="+dan*num);	
				
				
			}
			
			 
			System.out.println();
		}
	
	}
	}
	   
