package witharraylist;

public class VIPCustomer extends Customer {

	double saleRatio;
	private int agentId;

	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName); // ��ӹ��� Ŭ����(CustomerEx)�� �����ڰ� �⺻�����ڰ� �ƴ� �� super() �ȿ��� �ڷ��� ����x, ��������� �Ű����� ����
		// VIP�� Ư¡ �ʱ�ȭ
		customerGrade = "VIP";
		saleRatio = 0.1; // VIP���Ը� �ش�Ǵ� Ư¡���� ���� �߰������ �� (�ٸ���Ŭ������ �����Ƿ�)
		bonusRatio = 0.05;

		this.agentId = agentId; // ��������� �Ű������� ����
	}

	// #���ݰ���Լ�: �� ���� Ŭ�������� ����, ������ bonuspoint���� �޶�
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio; // ���ʽ�����Ʈ ���

		return price - (int) (price * saleRatio); // ��������Ʈ ���
	}

	// #��������Լ�
	public String ShowCustomerInfo() {
		return super.ShowCustomerInfo() + " ��� ���� ��ȣ�� " + agentId + "�Դϴ�."; // super: �ڽ�Ŭ�������� �θ�Ŭ������ �ż��� ������ ���� ���� �� ���, �������̵��� ���(������)
	}

	public int getAgentID() {

		return agentId;
	}

}
