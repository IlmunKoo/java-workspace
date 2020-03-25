package justcodeit;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		System.out.println("정렬방식을 선택하세요");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeaSort");
		System.out.println("Q: QuickSort");

		int ch = System.in.read();
		// 입력되는 문자(ch)에 따라 인스턴스 다르게 생성!!(동적할당)

		Sort sort = null; // 사용될 인스턴스 비워줌, 어떤 클래스가 사용될 지 모르니 상위 인터페이스인 Sort타입으로 지정

		// #입력된 문자에 따른 적합한 인스턴스 생성
		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort(); // 입력된 하위클래스대로 인스턴스 생성
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeaSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else
			System.out.println("지원하지 않는 포맷입니다.");

		
		//#들어갈 배열 정의
		int[] arr = new int[10];  
		
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}

}
