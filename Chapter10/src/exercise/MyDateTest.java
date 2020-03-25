package exercise;

class MyDate {
	int day;
	int month;
	int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals(Object obj) { // �������̵� ����(obj�� ���ϴ� Ŭ������ �ٿ�ĳ����)
		// #���� �������� instanceof�� üũ, true(���ٸ�)
		if (obj instanceof MyDate) {
			// #�ٿ�ĳ����
			MyDate date = (MyDate) obj;
			// #���� �� ����
			if (this.day == date.day && this.month == date.month && this.year == date.year)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return MyDate();
		
	}

	}

	
}

public class MyDateTest {

	public static void main(String[] args) {

		MyDate Date1 = new MyDate(10, 22, 2020);
		MyDate Date2 = new MyDate(10, 22, 2020);

		System.out.println(Date1.equals(Date2));
	}

}
