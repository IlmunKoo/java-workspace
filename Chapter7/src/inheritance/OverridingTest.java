package inheritance;

public class OverridingTest {

	public static void main(String [] args) {
		Customer customerLee = new Customer(10010,"�̼���");   //Customer Ÿ������ �ν��Ͻ� ����
		customerLee.bonusPoint = 1000;
		
	
		VIPCustomer1 customerKim = new VIPCustomer1(10020,"������");  //VIPCustomer Ÿ������ �ν��Ͻ� ����
		//������customer, VIPCustomer �ΰ��� �Ҹ�
		
		customerKim.bonusPoint = 10000;

		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		
		System.out.println(customerLee.showCustomerInfo() + "���ұݾ��� " + priceLee +"�� �Դϴ�.");

		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + priceKim +"�� �Դϴ�.");
		
		Customer customerNo = new VIPCustomer1(10030, "������");
		customerNo.bonusPoint = 10000;
		
		System.out.println(customerNo.showCustomerInfo() + "���ұݾ��� " + customerNo.calcPrice(10000) +"�� �Դϴ�.");

	}
}

//#�����Լ�
//�޼���: ��ü������ ����Լ�
//�����̸��� �޼���� ����! 
//�����ε��� ���� �޼��� ���ٰ� ������ ������ �� �� �̸��� ���ݾ� �ٲ�
//�����ǵ��� �ʾҴٸ� ����Ŭ���� �޼��尡 ȣ��
//�����ǵƴٸ� �����ǵ� �޼��尡 ȣ��
