package bookshelf;

public class BookShelf extends Shelf implements Queue { //extends ���� ��!

	@Override
	public void enQueue(String title) {  //���ݿ� �������
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {  //å�忡�� ������, queue�� �� �տ��� ��ȯ
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();   //Book�޼��� ��, super.getCount�ص� ��
	}

}
