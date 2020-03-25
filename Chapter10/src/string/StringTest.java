package string;

public class StringTest {
//String str1 = new String("abc");  :인스턴스로 생성
//String str2 = "abc";    :상수풀에 있는 문자열 가리킴(공유), 숫자나 문자는 상수풀에 존재, new하지 않고 이를 가리킬 뿐
	public static void main(String[] args) {

		String str1 = new String("abc");  //힙메모리에 할당
		String str2 = new String("abc");

		System.out.println(str1 == str2); // 메모리 위치 다르므로 false

		String str3 = "abc";
		String str4 = "abc";

		System.out.println(str3 == str4);  //상수풀에 있는 것을 가리키는 것이기 때문에 값이 같음
	   //둘다 equals하면 문자열 같기 때문에 true로 나옴	
	}

}
