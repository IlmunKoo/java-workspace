package hiding;

public class MyDate {
//���� ������: ����, �޼���, �����ڿ� , �ƹ��͵� �� ���� ���(�⺻ ���� ������, ���� ��Ű�������� �������� �ٸ� ��Ű�������� �Ⱥ���)���� ���� ���� ����
//public, private, protected ��
// ���� Ŭ������ ���� private ����/�ż��带 ����Ŭ������ public�ϰ� open�ϰ����� ��,
	
	private int day;
	private int month;
	private int year;
	//�̰�� Test���� day month year�� �� �����
	private boolean IsValid;
	//��������� �� �ʱⰪ false
	
	
	public void setDay(int day) {
		//��¥�� �������ְ� �ʹ�! �ϸ� �Ű������� ()�� ��¥�� �ϳ� ����
		this.day = day;
		//��������� ���� �Ѿ���� �Ű������� �̸��� ������ ��찡 ����> �� ��� ������ ����  ������� �տ� this �� ���
		//this�� �� ��� ���� ����� ������ �ν�, �Ű����� day�� day�� �����ϰڴٴ� ��		
	}
	//get �� �ϰ� set �� ���Ѵ�: read-only (id�Ͱ��� ������ �߿��� ������ ��ȣ����)
	public int getDay() {
		//�ַ� ����ϴ� ���� �̸��� ���� �ٿ���, getó��
	  return day;
	  //void���� �Լ� ������ return���� ����� ��
	  	  }
		
	//���콺 ������ > source > getters and setters ���� private�ɸ� �͵� ������ �� ����
		public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			IsValid = false;
			}
		else
			
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
		public void showDate() {
			
			if(IsValid) {
			System.out.println(year + "��" + month + "��" + day +"�� �Դϴ�. ");
			//�갡 ������ �Լ������س�����, �Լ�����(ȣ��)�� MyDateTest����!
			}
			else {
				System.out.println("��ȿ���� ���� ��¥�Դϴ�");
			}
		
//�ٸ� ��Ű���� �����ϰ� ���� �� public�� �־��ش�
		}
}
//���� private���� ���� �� �޼���� ���� ���� ���� ������ ��ȣ���� ���� ����!
//��� ������ private? �׷� �ʿ�� ����! private���� �ؾ߸� �ϴ� �͵鸸 �����
//getter setter: ���� �ְ� ���� ��, �ż��� �̸��� �̸� �־� �˱� ���� �Ѵ�
	

