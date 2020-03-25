package polymorphism;

public class GoldCustomer extends Customer {
  //��ӹ������� �����ڿ��� Customer�� �Ű����� �����ְ�, super �� ��� ��
	/*
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	int bonusPoint;
	double bonusRatio;
	//Customer�� �Ӽ��� ������
	 */
	 //������ �� �����;� ������ Customer ��ӹ����� ������ �ʿ� ����
	
	double salesRatio;	//VIP�� ����
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName); //����Ŭ������ Animal�� �����ڰ� �⺻�����ڰ� �ƴҰ�� super�� �Ἥ �̸� ����´�
		//�ΰ��� �Ű����� super�� ȣ��
		
		//���ο� Ŭ���� �߰��� ���� ��� ����, ��κ��� ������ ����Ŭ�������� �س����Ƿ� �籸���� �س����� ��(calcPrice����)
		 
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
		}
	
	public int calcPrice(int price) {
		bonusPoint += price* bonusRatio;
		return price - (int)(price*salesRatio);
	}

		
}
