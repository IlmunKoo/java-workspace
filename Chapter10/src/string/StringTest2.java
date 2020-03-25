package string;

public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
//먼저 만들었던 변수의 메모리 값

		java = java.concat(android); // java에 android가 붙었을 것 같지만, 메모리는 아예 새로운 인스턴스가 잡히고 나머지 자바와 안드로이드 문자열은 방치됨

		System.out.println(java);

		// 해시코드는 String에서 오버라이드(?)했으므로 사용x
		System.out.println(System.identityHashCode(java));
		//연결되면 새로운 메모리 가리킨다는 사실!
		
		//String연결해서 쓸 일 있다: Stringbuilder와 StringBuffer사용
//StringBuffer의 경우 계속 연결(메모리 따로 잡지x)
	}

}
