class Book{
	public static String pub = "�й����������";
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
		return "������" + this.bookName + "���۸�" + this.price + "�������磺" + Book.pub;
	}
}
public class TestDemo{
	public static void main(String args[]){
		Book book = new Book("ë���Դ�",99.8);
		System.out.println(book);
	}
}