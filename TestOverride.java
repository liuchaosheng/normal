class A{
	void fun(){
		ConsoleLog.info("A��fun����ִ��");
	}
	// �÷����ڲ�������fun����
	public void ff(){
		this.fun();
	}
}
class B extends A{
	public void fun(){
		ConsoleLog.info("B��fun����ִ��");
	}
}
class C extends A{
	public void fun(){
		ConsoleLog.info("C��fun����ִ��");
	}
}


// ����ּ�ڲ��Է�����д�Ķ�̬��
public class TestOverride{
	public static void main(String args[]){
		outFun(new C());
	}
	public static void outFun(A a){
		a.ff();
	}
}