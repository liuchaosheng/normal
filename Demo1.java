public class Demo1{
	public static class InnerDemo1{
		public static void print(Object o){
			System.out.println(o) ;
		}
		public void printNext(Object o){
			System.out.print(this) ;
			System.out.println("==>"  + o) ;
		}
	}
	
	public static void main(String args[]){
		System.out.println("HelloWorld!!") ;
		String name = "уехЩ" ;
		int age = 30 ;
		InnerDemo1.print(name) ;
		InnerDemo1.print(age) ;

		InnerDemo1 inner = new InnerDemo1() ;
		inner.printNext(name) ;
		inner.printNext(age) ;
	}
}