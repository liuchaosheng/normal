class A{
	void fun(){
		ConsoleLog.info("A的fun方法执行");
	}
	// 该方法内部调用了fun方法
	public void ff(){
		this.fun();
	}
}
class B extends A{
	public void fun(){
		ConsoleLog.info("B的fun方法执行");
	}
}
class C extends A{
	public void fun(){
		ConsoleLog.info("C的fun方法执行");
	}
}


// 本例旨在测试方法覆写的多态性
public class TestOverride{
	public static void main(String args[]){
		outFun(new C());
	}
	public static void outFun(A a){
		a.ff();
	}
}