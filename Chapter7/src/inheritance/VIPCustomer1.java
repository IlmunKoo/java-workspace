package inheritance;

public class VIPCustomer1 extends Customer {  
	
/*	public VIPCustomer1( )   
	{
		
		
		customerGrade = "VIP";   
		bonusRatio = 0.05;    
		salesRatio = 0.1;      
		
		System.out.println("VIP Customer()������ ȣ��");
	}
*/

public VIPCustomer1(int customerID, String customerName) {  //���̵�� �̸��� �Ű������� �޴� ������ ����� �װ����� super�� ��������� �ҷ���!

	super(customerID, customerName);
	customerGrade = "VIP";  
	bonusRatio = 0.05;
	salesRatio = 0.1;
	
	System.out.println("VIPCustomer(int, String) ������ ���");
	
}

double salesRatio;

private int agentID;  

@Override  //annotation: �����Ϸ����� �������̵��� �ż����� ������
public int calcPrice(int price ) {
  bonusPoint += price * bonusRatio;
  return  price - (int)(price * salesRatio);
  //���� Ŭ���������� price�� �ٷ� ����������, ���⼭�� ���ε� ���� ����(�������̵�, �ٸ��� ����)
}



//�����ε�: �޼��� �̸��� ������ �Ű����� �̸� �ٸ�
//�������̵�: ����Ŭ������ �̹� ������ �ڵ�� �ٸ��ڵ�� �籸��

}
