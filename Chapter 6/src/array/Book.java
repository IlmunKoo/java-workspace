package array;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	//����Ʈ ������ �ϳ�, �Ű����� �ִ� ������ �ϳ� ����, �� �� ����� �Ϳ� ū �ǹ̴� ����
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	
	// ������� �ٷ� getter setter ����
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(title + "," + author);		
	}
	

}
