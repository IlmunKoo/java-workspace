package bookshelf;

public interface Queue {
	void enQueue(String title);  //집어넣는애
	String deQueue();
	
	int getSize();

}
