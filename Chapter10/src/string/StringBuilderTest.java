package string;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java);

		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		// 메모리 주소값 이어붙여도 같은 것 확인!!
		java = buffer.toString();  //toString: 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드

		System.out.println(java);

	}

}
/* String(불변) vs StringBuffer&StringBuilder(가변)
 * String literalString = "literal"; //리터럴로 생성하는 방식=> 상수풀에 생성, 같은 문자열 만들면 생성하지 않고 상수풀에 있는 동일한 문자열 가리킴
 * 메모리공간 변하지 않음, 이 공간에 생긴 문자열 변하지 않음
 * 이렇게 생긴 문자열은 가비지콜렉터에 의해 제거되어야 한다는 단점(언제 제거될 지 모른다), 계속 문자열 만드는 오버헤드 위험(성능 떨어짐) 
 * 장점: 조회 많은 환경에서 유리, 멀티쓰레드 환경에서 유리
 * 
 * StringBuffer, StringBuilder: mutable(가변) 	
 * 문자열 연산 자주 발생시 문자열이 변경가능한 객체이므로 유리함
 * String newString = new String("literal"); //new로 생성하는 방식
 * StringBuffer: 멀티쓰레드 환경에서 동기화 가능
 * StringBuilder: 동기화 불가능
 * 
 */