package justcodeit;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");

	}

	@Override
	public void description() {
		Sort.super.description(); // 상위(super)인터페이스에 구현된 디폴트 메서드 끌어와 그대로 구현 + 밑에 오버라이딩하고싶은 것 ㅅ구현
		System.out.println("QuickSort입니다.");

	}

}
