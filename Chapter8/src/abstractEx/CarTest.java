package abstractEx;

public class CarTest {

	public static void main(String[] args) {

		Car aiCar = new AICar(); // �ν��Ͻ� Ÿ���� AICar�� �ص� �ǰ� Car�� �ص� ��
		aiCar.run();

		System.out.println("====================");
		Car manualCar = new ManualCar();
		manualCar.run();
	}

}

//�Ʒ�ó�� �����ӿ�ũ�� �帧�� ������ �ִ�!

//�õ��� �մϴ�
//���� �����մϴ�.
//�ڵ����� ������ ������ �ٲߴϴ�.
//������ ����ϴ�
//�õ��� ���ϴ�
//====================
//�õ��� �մϴ�
//����� �����մϴ�.
//����� �ڵ��� �����մϴ�.
//�극��ũ�� ��Ƽ� �����մϴ�.
//�õ��� ���ϴ�

