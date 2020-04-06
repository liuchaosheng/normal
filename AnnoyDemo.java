interface IMessage {
	void print();
}
public class AnnoyDemo{
	public static void main(String args[]){
		// 匿名内部类，只是在方法中有效，且每次方法执行只能使用一次
		fun(new IMessage(){
			public void print(){
				System.out.println("我是匿名内部类，我是局部内部类的特殊形式！");
			}
		});
	}
	public static void fun(IMessage msg){
		msg.print();
	}
}