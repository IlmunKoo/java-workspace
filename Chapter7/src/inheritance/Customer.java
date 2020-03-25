package inheritance;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	/*
	public Customer() {    //�⺻������  �ַ� ������� �ʱ�ȭ
		customerGrade = "SILVER";   //int: 0, string(��ü): null�� �ʱ�ȭ
			bonusRatio = 0.01;
			System.out.println("Customer() ������ ȣ��");
	}*/
	
   
	
	//������ �߰�, �⺻�����ڴ� ��������
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";    //�⺻��������
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) ������ ȣ��");
		
	}
     
	
	//���ݰ���Լ� ����
		public int calcPrice(int price) {   //����: ���� ������ ���ʽ� ����Ʈ ������ �ְ� ���ݹ�ȯ
		bonusPoint += price*bonusRatio;
		return price; //������ ���� ��ȯ
	}
		
		
	//��������Լ� ����
	public String ShowCustomerInfo() {
		
		return customerName + "���� ����� " + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ�� " + bonusPoint +"�� �Դϴ�.";
	}
	
	
	
	//GetterSetter	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
 	
}
