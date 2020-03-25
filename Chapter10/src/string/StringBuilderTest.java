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
		// �޸� �ּҰ� �̾�ٿ��� ���� �� Ȯ��!!
		java = buffer.toString();  //toString: ��ü�� ������ �ִ� ������ ������ ���ڿ��� ����� �����ϴ� �޼ҵ�

		System.out.println(java);

	}

}
/* String(�Һ�) vs StringBuffer&StringBuilder(����)
 * String literalString = "literal"; //���ͷ��� �����ϴ� ���=> ���Ǯ�� ����, ���� ���ڿ� ����� �������� �ʰ� ���Ǯ�� �ִ� ������ ���ڿ� ����Ŵ
 * �޸𸮰��� ������ ����, �� ������ ���� ���ڿ� ������ ����
 * �̷��� ���� ���ڿ��� �������ݷ��Ϳ� ���� ���ŵǾ�� �Ѵٴ� ����(���� ���ŵ� �� �𸥴�), ��� ���ڿ� ����� ������� ����(���� ������) 
 * ����: ��ȸ ���� ȯ�濡�� ����, ��Ƽ������ ȯ�濡�� ����
 * 
 * StringBuffer, StringBuilder: mutable(����) 	
 * ���ڿ� ���� ���� �߻��� ���ڿ��� ���氡���� ��ü�̹Ƿ� ������
 * String newString = new String("literal"); //new�� �����ϴ� ���
 * StringBuffer: ��Ƽ������ ȯ�濡�� ����ȭ ����
 * StringBuilder: ����ȭ �Ұ���
 * 
 */