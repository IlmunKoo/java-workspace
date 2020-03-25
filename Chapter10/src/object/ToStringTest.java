package object;

//#Object 관련 메서드
class Book implements Cloneable { // Book클래스가 복제가능하다!
	String title;
	String author;

	public Book(String title, String author) { // 생성자
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	// #책 복사 메서드 구현하기 clone: 인스턴스값 그대로 복제 구현
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // 건드릴 필요x
	} // 오버라이드 쓴다고 끝나는 게 아니라 위에도 명시를 해 줘야 함(cloneable)

	@Override // 객체가 힙 메모리에서 해제될 때 가비지콜렉터에서 호출(리소스 해제, 안닫힌 소켓 닫는 등의 역할)
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}

public class ToStringTest {// extends Object 안써도 컴파일러가 붙여준다!

	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("토지", "박경리");

		System.out.println(book); // bookshelf.Book@15db9742(해시코드, 메모리주소)

		Book book2 = (Book) book.clone(); // clone하면 원형이 object로 반환
		// 메모리 생성시 예외발생가능!
		System.out.println(book2);
		// class가 clone을 사용하려면 명시해줘야 함!

		/*
		 * String str = new String("토지"); System.out.println(str.toString());
		 */// 생성자에 넣은 문자열이 출력, String 클래스는 jdk클래스, toString이라는 메서드가 이미 정의
	} // String은 Object의 메서드, 이를 재정의해서 string 안 캐릭터의 배열출력하도록??

}
