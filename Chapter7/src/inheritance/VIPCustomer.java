package inheritance;

public class VIPCustomer extends Customer {   //���� Customer�� �ִ� ���� ��ɵ� �ٽ� �����ڿ� �ִ� �ͺ���  ����ϴ� ���� ����
                                              //Customer���� VIPCustomer�� ����� �� Ȯ��� Ŭ�����̹Ƿ�
	                                          //base�� Customer�� �ΰ� add �ϸ� ��

	
	/*
	public VIPCustomer( )   //������(contructor)
	{
		//super();  //����Ŭ������ �⺻������ ȣ��, ������ �������� precompile�ܰ迡 ���Ե�(��, ����Ŭ������ ���� ������!), �����Ϸ��� ȣ��
	   	//Customer���� �Ű����� �ִ� ������ ����� �⺻������ ����x, VIP���� ȣ���� super�� ��� ������
		//�� ��� �� ���� Ŭ��������(VIPClass) super�� ��������� �ҷ���� ��
        //Customer �Ű������� ������ VIPCustomer������ �����, super �ҷ��� 		
		
		
		customerGrade = "VIP";   //��ӹ����� ����Ŭ������ �� �� �ִٰ� ������, ���ٶߴ� ����?
		//Customer���� customerGrade�� private�̱� ����(��ӿ����� �Ұ�)
		//�ܺ�Ŭ������ ���� �������� �ϰ� ������, �ڽ�Ŭ�������Դ� �����㰡���ְ� ���� ��? protected
		//����ڿ��Դ� public, �ܺο��� private
		bonusRatio = 0.05;     //���ʽ� ����
		salesRatio = 0.1;      //������
		
		System.out.println("VIP Customer()������ ȣ��");
	}*/


//VIPCustomer�� ������ �߰� ����
public VIPCustomer(int customerID, String customerName) {  //���̵�� �̸��� �Ű������� �޴� ������ ����� �װ����� super�� ��������� �ҷ���!
	//=>customer�� �Ű����� �ִ�  ������ �Ҹ�
	super(customerID, customerName);
	customerGrade = "VIP";  
	bonusRatio = 0.05;
	salesRatio = 0.1;
	
	System.out.println("VIPCustomer(int, String) ������ ���");
	
}

double salesRatio;

private int agentID;  //��� ���� ����
	
}
