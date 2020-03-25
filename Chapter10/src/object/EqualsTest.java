package object;

class Student {
	int studentNum;
	String studentName;
	
	//#생성자
	public Student(int studentNum, String studentName) { 
		this.studentNum = studentNum;  //this: 멤버변수 의미, 매개변수로 받은 것을 멤버변수에 담아 두겠다!!
		this.studentName = studentName;
	}

	//#equals 오버라이딩, 동시에 hashCode 오버라이딩 해줘야 함
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj; //Object는 모든 클래스의 최상위클래스이므로=> Student로 다운캐스팅!!, obj을 std에 담겠다!, Student에서만 정의된   studentName과 StudentNum 사용 위해
			
			// return (this.studentNum == std.studentNum); //this가 가리키는 것?
			if (this.studentNum == std.studentNum)  //해시코드 코딩시 멤버값 이용!
				return true;
			else
				return false;
		}
		return false; // Student 아닌 경우
        //메모리 주소 달라서 논리적으로 같은 경우 같다고 처리해야 오류x
		//hashCode: 인스턴스 생성시 받은 메모리 주소
	}

	@Override
	public int hashCode() {  //equals에 쓴 멤버 활용,같으면 true이므로 같은값 리턴
		return studentNum;
	}

	/*equals(): 두 객체의 내용이 같은지 확인하는 Method :Object에 정의된 equals는 단순히 (this == obj)로 비교
	=>equals를 오버라이딩해서 해결
	hashCode(): 두 객체가 같은 객체인지 확인하는 Method
	=>hashCode()로 native call을 하여 Memory에서 가진 해쉬 주소값을 출력
	특별한 설정하지 않을 경우 System.identityHashCode()와 동일한 값 나타냄
	*/
}

public class EqualsTest {

	public static void main(String[] args) {
		/*
		 * String str1 = new String("abc"); String str2 = new String("abc");
		 * 
		 * System.out.println(str1 == str2); // 두 개의 메모리가 같은가를 물어봄
		 * System.out.println(str1.equals(str2)); // 두개의 문자열이 같은지 비교 // equals로
		 * 재정의(String 형식의 경우 문자열 같으면 같다!라고 인식)
		 */

		/*
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		// 위 두 개는 힙 주소가 같음
		Student Shin = new Student(100, "이순신");
		// 힙 주소 다르지만 내용은 동일

		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Shin)); // 원형은 주소비교! 우리는 논리적으로 같은 것 구현하고 싶음

		System.out.println(Lee.hashCode());
		System.out.println(Shin.hashCode());
		*/
	
		Integer i1 = new Integer(100);
		Integer i2 = 100;   //정수에는 new 안붙여줘도 됨, 인스턴스 다르더라도 true
		
		//#equals와 hashcode 둘 다 오버라이딩해줌
		System.out.println(i1.equals(i2));  //두 객체가 같다고 했을 때 두 객체가 반환하는 해시코드도 동일하게 오버라이딩한다!
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		
		System.out.println(System.identityHashCode(i1)); //객체의 실제 해시코드값
		System.out.println(System.identityHashCode(i2)); //두 개의 실제 메모리값은 다름  
	}
}

//객체가 동일하다: 실제 메모리주소 다르더라도 논리적으로 동일: equals() 반환값 true
//동일한 hashCode 값 가질 때
//일반적으로 equals 오버라이딩시 hashCode도 오버라이딩함
