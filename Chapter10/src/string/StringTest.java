package string;

public class StringTest {
//String str1 = new String("abc");  :�ν��Ͻ��� ����
//String str2 = "abc";    :���Ǯ�� �ִ� ���ڿ� ����Ŵ(����), ���ڳ� ���ڴ� ���Ǯ�� ����, new���� �ʰ� �̸� ����ų ��
	public static void main(String[] args) {

		String str1 = new String("abc");  //���޸𸮿� �Ҵ�
		String str2 = new String("abc");

		System.out.println(str1 == str2); // �޸� ��ġ �ٸ��Ƿ� false

		String str3 = "abc";
		String str4 = "abc";

		System.out.println(str3 == str4);  //���Ǯ�� �ִ� ���� ����Ű�� ���̱� ������ ���� ����
	   //�Ѵ� equals�ϸ� ���ڿ� ���� ������ true�� ����	
	}

}
