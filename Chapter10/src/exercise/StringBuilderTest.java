package exercise;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java); // 정보나 메시지를 문자열로 만듦

		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(buffer);      //주소값 바꾸지 않고 그대로 추가해줌
		System.out.println(System.identityHashCode(buffer));
		
		System.out.println(buffer);
		java = buffer.toString();
		
		System.out.println(java);
		
		
		
		
		
	}

}
