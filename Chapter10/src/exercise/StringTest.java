package exercise;

public class StringTest {

	public static void main(String[] args) {

		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		//다른 인스턴스 주소, 같은 내용
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		//같은 참조값 사용
	}

}
