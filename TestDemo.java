class Book{
	public static String pub = "中国人民出版社";
	private String bookName;
	private Double price;
	public Book(){
	}
	public Book(String bookName,Double price){
		this.bookName = bookName;
		this.price = price;
	}
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getBookName(){
		return this.bookName;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Double getPrice(){
		return this.price;
	}
	@Override
	public String toString(){
		return "书名：" + this.bookName + "，价格：" + this.price + "，出版社：" + Book.pub;
	}
}
public class TestDemo{
	public static void main(String args[]){
		Book book = new Book("毛泽东自传",99.8);
		System.out.println(book);
	}
}