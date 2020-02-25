package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		//객체배열 복사완료
		
		//향상된 포문>> 어떤객체로 엘리먼트 꺼내올 것인지 선언(타입선언, 변수선언 : copyLibrary
		/*for(Book book : copyLibrary ) {//copyLibrary 의 array 전체를 다 돈다(length만큼)
			//꺼내올 때마다 book이라는 변수에다 넣겠다
			book.showBookInfo();
			
		}*/
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		//library만 바꿨는데 copylibrary까지 같이 바뀐 것을 알 수 있음
		//>>얕은 복사>> 인스턴스가 새로 생겨서 복사된 것이 아닌, 주소만 복사된 것임
		//두 개의 객체 어레이가 같은것을 가리키게 됨
		//인스턴스를 따로따로 가지고싶을 경우 System.array쓰는 것이 아니라
		//일일히 객체 book을 새로 만들어야 함(깊은 복사), 
		
		for (Book book : library) {
			book.showBookInfo();
		}
		System.out.println("======================");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
			
		}
		

	}

}
