package bookshelf;

import java.util.ArrayList;

public class Shelf {  //�������̽��� Ŭ���� ��� ���ÿ� �ޱ�

	protected ArrayList<String> shelf;
	
	public Shelf() {    //ArrayList ������ �ַ� �����ڿ���!
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){  //shelf�� ������
		return shelf;
	}
	public int getCount() {  //Shelf�� ������ ������
		return shelf.size();
	}
}
