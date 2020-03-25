package bookshelf;

import java.util.ArrayList;

public class Shelf {  //인터페이스와 클래스 상속 동시에 받기

	protected ArrayList<String> shelf;
	
	public Shelf() {    //ArrayList 생성은 주로 생성자에서!
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf(){  //shelf를 가져옴
		return shelf;
	}
	public int getCount() {  //Shelf의 개수를 가져옴
		return shelf.size();
	}
}
