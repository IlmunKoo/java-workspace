package exercise;

//#Student 클래스 : 생성자, equals 오버라이딩, hashCode오버라이딩
class Student {
	int studentNum;
	String studentName; // 괄호 붙으면 메서드, 괄호 안붙으면 멤버변수

	Student(int StudentNum, String StudentName) {
		this.studentName = StudentName;
		this.studentNum = StudentNum;
	}

	@Override
	public boolean equals(Object obj) { // 같은지 다른지를 true, false를 이용해서 표현
		if (obj instanceof Student) {
			// instanceof: 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용
			// true 값 반환받을 시 참조변수가 변환한 값으로 형변환 가능하다는 뜻!!
			Student std = (Student) obj; // 다운캐스팅으로 두 인스턴스의 형을 맞춰줌
			if (this.studentNum == std.studentNum) // this: 멤버변수 의미, Student연산자를 통해 매개변수로 받은 값 지칭, std: equals를 통해 매개변수로
													// 받은 값 의미
				return true;
			else
				return false;
		}
		return false;

	}

	@Override
	public int hashCode() {
		return studentNum;

	}

}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "이순신");
		Student Shin = new Student(100, "이순신");

		System.out.println(Lee.equals(Shin));
		System.out.println(Shin);
		System.out.println(Lee.hashCode());  //equals 값이 같다면 hashCode값도 같아야 함
		System.out.println(Shin.hashCode());
		
		System.out.println(System.identityHashCode(Lee)); //실제 해시코드 주소값
		System.out.println(System.identityHashCode(Shin));

	}

}
