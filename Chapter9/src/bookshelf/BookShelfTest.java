package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();  //상위 인터페이스 타입, Queue가 인터페이스에서 명시
		bookQueue.enQueue("태백산맥1");
		bookQueue.enQueue("태백산맥2");
		bookQueue.enQueue("태백산맥3");
		
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}


//인터페이스 사용 이유가 무엇인가?
//인터페이스의 설계 이유는 무엇인가
//인터페이스에서 명시한 것은 반드시 하위클래스에서 구현 vs
//추상클래스에서 명시한 매서드들 중 구현부가 있는 매서드도 있고, 구현부 없는 추상매서드도 있을 수 있음
