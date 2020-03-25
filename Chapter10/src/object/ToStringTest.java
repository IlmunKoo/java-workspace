package object;

//#Object ���� �޼���
class Book implements Cloneable { // BookŬ������ ���������ϴ�!
	String title;
	String author;

	public Book(String title, String author) { // ������
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return author + "," + title;
	}

	// #å ���� �޼��� �����ϱ� clone: �ν��Ͻ��� �״�� ���� ����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // �ǵ帱 �ʿ�x
	} // �������̵� ���ٰ� ������ �� �ƴ϶� ������ ��ø� �� ��� ��(cloneable)

	@Override // ��ü�� �� �޸𸮿��� ������ �� �������ݷ��Ϳ��� ȣ��(���ҽ� ����, �ȴ��� ���� �ݴ� ���� ����)
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}

public class ToStringTest {// extends Object �Ƚᵵ �����Ϸ��� �ٿ��ش�!

	public static void main(String[] args) throws CloneNotSupportedException {
		Book book = new Book("����", "�ڰ渮");

		System.out.println(book); // bookshelf.Book@15db9742(�ؽ��ڵ�, �޸��ּ�)

		Book book2 = (Book) book.clone(); // clone�ϸ� ������ object�� ��ȯ
		// �޸� ������ ���ܹ߻�����!
		System.out.println(book2);
		// class�� clone�� ����Ϸ��� �������� ��!

		/*
		 * String str = new String("����"); System.out.println(str.toString());
		 */// �����ڿ� ���� ���ڿ��� ���, String Ŭ������ jdkŬ����, toString�̶�� �޼��尡 �̹� ����
	} // String�� Object�� �޼���, �̸� �������ؼ� string �� ĳ������ �迭����ϵ���??

}
