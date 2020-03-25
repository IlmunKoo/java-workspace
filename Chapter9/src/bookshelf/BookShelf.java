package bookshelf;

public class BookShelf extends Shelf implements Queue { //extends 먼저 옴!

	@Override
	public void enQueue(String title) {  //선반에 집어넣음
		shelf.add(title);
		
	}

	@Override
	public String deQueue() {  //책장에서 없어짐, queue는 맨 앞원소 반환
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();   //Book메서드 것, super.getCount해도 됨
	}

}
