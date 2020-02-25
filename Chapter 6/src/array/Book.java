package array;

public class Book {
	
	private String title;
	private String author;
	
	public Book() {}
	//디폴트 생성자 하나, 매개변수 있는 생성자 하나 만듦, 두 개 만드는 것에 큰 의미는 없음
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	
	// 위저드로 바로 getter setter 만듦
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
