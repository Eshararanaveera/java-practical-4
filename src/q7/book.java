package q7;

public class book {

	String title;
	String author;
	int pageCount;
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
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public boolean isShortBook() {
		
		if(pageCount<200) {
			return true;
		}else {
			return false;
		}
	}
	public void bookapp() {
		System.out.println("");
	}
}
