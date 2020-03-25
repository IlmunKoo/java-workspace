package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();

		// #�ν��Ͻ� ����(with �ٿ�ĳ����, �� ����޿����� �� �� �ִ� �͵��� �ֱ� ����(calcPrice))
		Customer customerKoo = new VIPCustomer(10001, "���Ϲ�", 12345); // VIPCustomer�� CustomerTest�� instance���� ��
		Customer customerKim = new GoldCustomer(10002, "������"); // �ٿ�ĳ����
		Customer customerLee = new GoldCustomer(10003, "�̼���");
		Customer customerHong = new Customer(10004, "ȫ�浿");
		Customer customerKang = new Customer(10005, "������");

		// #ArrayList ����

		customerList.add(customerKoo);
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerHong);
		customerList.add(customerKang);

		System.out.println("=============������ ���===================");

		for (Customer customer : customerList) { // ���� for�� : �迭������ ��� for(Ŭ���� �迭������ ������ : �迭��), ���ϴ� �������� for�� �ȿ����� ���
			
			System.out.println(customer.ShowCustomerInfo());	

		}

		System.out.println("=============�������� ����Ʈ ���===============");

		int price = 10000; // �⺻ ���� 10000���� ��

		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "���� �����Ͻ� �ݾ���" + customer.calcPrice(price));
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ��" + customer.bonusPoint);

			// ���ʽ�����Ʈ�� calcPoint���� ���� ��������� ���ϵ����� ����, �׳� �θ��� ���´�

		}

	}

}
