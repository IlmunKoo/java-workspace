package exercise;

public class StringBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java); // ������ �޽����� ���ڿ��� ����

		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(buffer);      //�ּҰ� �ٲ��� �ʰ� �״�� �߰�����
		System.out.println(System.identityHashCode(buffer));
		
		System.out.println(buffer);
		java = buffer.toString();
		
		System.out.println(java);
		
		
		
		
		
	}

}
