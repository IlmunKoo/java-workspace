package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
         
		Customer customerLee = new Customer(10010,"�̼���");
		//���� ������ Ÿ��, �⺻������ ��� ����
		//customerLee.setCustomerName("�̼���");
		//customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		
	
		Customer customerKim = new VIPCustomer(10020,"������");
		//VIP�� Customer�� ��� ����, VIP���� Ÿ�� ��� �� ����
		//����Ŭ���� Ÿ��(Customer���� ��������, ����Ŭ����(VIP)�� �ν��Ͻ� ����: ���������� �̷����!(�� �� ���ص� �ڿ����� �̷����)
				
		//VIPCustomer customerKim = new VIPCustomer(10020, "������");
		
		
		
		//super�� �����ڿ� �Ű����� �߰������Ƿ� ���⵵ �Ű����� �߰����ش�
	    //CustomerKim.setCustomerName("������");
		//customerKim.setCustomerID(10020);
		customerLee.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
		//customerLee = customerKim; 
		//����Ŭ���� Ÿ��(CustomerKim, VIP)�� ����Ŭ���� Ÿ��(Lee, Customer)�� �ڵ� (������)����ȯ �ȴ�(��ĳ����)
		//���� �������� ����
		//Customer VC = new VIPCustomer();
		//����Ŭ������ ����Ŭ������ Ȯ��� ���¿� addone�� �� ���̹Ƿ� ����Ŭ������ �״�� ������ ��
		
		//customerKim.
		//�޸𸮴� VIPCustomer ���� ����������� Ÿ���� Customer�� �ٲ�����Ƿ� customer���� ��� ������ �����ۿ� ���� �ʴ´�!
	}

}

//VIP Customer�� �����ߴµ� Customer�� ��� ���� ��� ����(��޵� ��� ����)
//����Ŭ���� ������ �� ����Ŭ������ �ݵ�� ���� ȣ��ž� ��
//super�� ���� ���� ��(����Ŭ�����Ǹ޸� ��ġ, ������ ����)
//Ŭ������ �⺻������ �������� ���� ��� super�� ���� ��������� ȣ��, ����Ŭ������ ����Ŭ�������� ���� �����ž� ��, ���� ����Ŭ������ �޸𸮰� ���� ����
//����Ŭ���� �ν��Ͻ��� ���� ����, ����Ŭ���� �ν��Ͻ��� ���߿� ����