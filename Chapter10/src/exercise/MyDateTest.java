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
	public boolean equals(Object obj) { // 오버라이딩 시작(obj를 원하는 클래스로 다운캐스팅)
		// #먼저 가능한지 instanceof로 체크, true(같다면)
		if (obj instanceof MyDate) {
			// #다운캐스팅
			MyDate date = (MyDate) obj;
			// #이제 비교 가능
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
