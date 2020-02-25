package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		//0번째부터 돌아야 하므로 index 필요, inhanced for 사용x
		for(int i = 0; i < library.length; i++) {
			//Book을 쭉 만들어 주고
			//멤버변수의 값을 일일히 복사해줌
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		
		


		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		//서로 다른 인스턴스, library만 바뀌고, copylibrary는 바뀌지 않음
		//향상된 for문, for(변수선언 : 배열){반복실행문;}
		for (Book book : library) {
			book.showBookInfo();
		}
		System.out.println("======================");
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
			
		}
		

	}

}
