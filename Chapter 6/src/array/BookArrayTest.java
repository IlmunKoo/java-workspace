package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		//배열이 생길 뿐, 책이 5권이 생기지 않음. 책이 5권 생기려면 한권씩 new 를 넣어줘야 함
		//객체 배열 쓸 때 유의점: 배열이 생겼다고 끝이 아님, 각 인스턴스 생성해서 각 요소에 assign해 줘야 함
		//생성 안해줄 경우 null 
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
			//showBookInfo는 그 자체가 출력문이기 때문에 그냥 적어주면 됨
		}
		//library 배열 내에 는 장차 책의 주소값이 들어가는 자리
		//아무 값도 지정되지 않을경우  null

	}

}
