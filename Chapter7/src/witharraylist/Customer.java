package witharraylist;

public class Customer {

	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint ;
    double bonusRatio;
    
    private void initCustomer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;	
	}
	
    
    
    public Customer() {   //�⺻������?
    	  initCustomer();
    }
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
	    this.customerName = customerName;
	    
	    
	    initCustomer();
	}
	
	//���ݰ���Լ�(��� ���� ���ʽ�����Ʈ ����Լ���� �д´�)
	
	public int calcPrice(int price) {   //�Լ� ���� �� : ���������� �ڷ��� �Լ��̸�(�Ű�����1, ...){����} ex) public int blabla(int blabla){}
		
		//this.price = price;   �̷��� �� �� �ʿ����  price �ٷ� �� �ָ� ��, price�� �� �Լ� �ȿ��� �� ���̱� ������ �ۿ� ���������� �ʾҰ�, �Լ��ۿ� ������ �̸��� ������ ���� ��� ���� �ʾƵ� ��
		
		bonusPoint += price*bonusRatio;
		return price ;
			}
	
	public String ShowCustomerInfo() {  //�긦 ���߿� Customer�ν��Ͻ��� �ٿ��� ��� customerLee.showCustomerInfo()
		
		return customerName + "���� ����� " +customerGrade + " �̸�, ���ʽ� ����Ʈ��" + bonusPoint +" �� �Դϴ�."; 
	}

	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
