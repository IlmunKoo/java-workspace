package exercise;

import java.io.IOException;

public class CounselTest {

	public static void main(String[] args) throws IOException {  //�ϴ� ����ó��

		System.out.println("��ȭ���� �Ҵ� ����� �����ϼ���");
		System.out.println("R: �� �� ���ʴ�� ");
		System.out.println("L: ��Ⱑ ���� ���� �켱");
		System.out.println("P: �켱������ ���� �� �켱, ���õ� ���� ����");
		
		int ch = System.in.read();  //�Է¹޴� ���� ���⿡ ��ڴ�
		CounselEx scheduler = null; //�����Ҵ����� �ּҰ� �����
		if(ch == 'R' || ch == 'r') {
		    scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		//�Է°��� ���� �ν��Ͻ� ����(���� �����Ҵ� ��, �� �ν��Ͻ��� �´� �ż��� ���۽�Ŵ
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
