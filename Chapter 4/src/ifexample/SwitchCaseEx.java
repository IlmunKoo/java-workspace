package ifexample;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//scanner ������-> ctrl+shift+o �ڵ� ����Ʈ
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
		case 1 : medalColor = 'G';
		 System.out.println("�ݸ޴�");
		    break;
		   
		    //case�� �����ٴ� �ǹ̷� break�� �� ��� ��, case������ �߰�ȣ ���� ����
		    //break : �߰�ȣ ����������� �ǹ�
		    //break�� ������ 'G'��  �ݸ޴��� ��ġ�Ǿ ���������� �ʰ� ��� ������������ �����
		case 2 : medalColor = 'S';
		 System.out.println("���޴�");
		    break;
		   
		case 3 : medalColor = 'B';
		 System.out.println("���޴�");
		    break;
		   
		default : medalColor = 'A';		
		//��� �� but ���� ���
		//char medalColor = '�ʱⰪ' ��������� ��
	
		
		}
		
		System.out.println(rank + "����" + medalColor + "�޴� �Դϴ�.");
	}

}
