package string;

public class StringTest2 {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
//���� ������� ������ �޸� ��

		java = java.concat(android); // java�� android�� �پ��� �� ������, �޸𸮴� �ƿ� ���ο� �ν��Ͻ��� ������ ������ �ڹٿ� �ȵ���̵� ���ڿ��� ��ġ��

		System.out.println(java);

		// �ؽ��ڵ�� String���� �������̵�(?)�����Ƿ� ���x
		System.out.println(System.identityHashCode(java));
		//����Ǹ� ���ο� �޸� ����Ų�ٴ� ���!
		
		//String�����ؼ� �� �� �ִ�: Stringbuilder�� StringBuffer���
//StringBuffer�� ��� ��� ����(�޸� ���� ����x)
	}

}
