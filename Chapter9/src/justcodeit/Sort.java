package justcodeit;

public interface Sort {

	void ascending(int[] arr);

	void descending(int[] arr);

	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");    //인터페이스에서 동일한 메서드를 정의하고 하위클래스에서 끌어쓰게 하고 싶을 때 디폴트로 정의, 하위에서 이를 super를 통해 끌어쓰고, 오버라이딩 가능
	}
}

// 디폴트 메소드 : 인터페이스에서 새로운 메소드를 구현할 필요가 있지만, 이미 어떤 구현체 클래스가 구현되어있고, 이를 수정하기 어려울 때
// 인터페이스에서 원하는 메서드를 추가하고, 이를 필요한 클래스에서 상속&오버라이딩해서 사용가능!!