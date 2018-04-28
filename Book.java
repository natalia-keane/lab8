package lab8;

public class Book {
	 String title, publisher; 
	 int chapters,pages;
	 
	 public Book(String title, String publisher, int chapters, int pages){
		 this.title=title;
		 this.publisher=publisher;
		 this.chapters=chapters;
		 this.pages=pages;
	 
	 }
	 
	 
	 
	 public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public int getChapters() {
		return chapters;
	}



	public void setChapters(int chapters) {
		this.chapters = chapters;
	}



	public int getPages() {
		return pages;
	}



	public void setPages(int pages) {
		this.pages = pages;
	}



	public String toString(){
		 
		 return title+" published by "+publisher+" has "+pages/chapters+" per chapter.";
		 
		 
	 }
}
