package club.zylearn.demo;

/**
 * 该类用于测试对象实例化的过程
 * @author chaos
 *
 */
public abstract class ConProcess {
	private String msg = "default - msg";
	{
		System.out.println("（1）构造块执行前 msg = " + this.msg);
		this.msg = "con block - msg";
		System.out.println("（2）构造块执行后 msg = " + this.msg);
	}
	public ConProcess(String msg) {
		System.out.println("（3）构造方法执行前 msg = " + this.msg);
		this.msg = msg;
		System.out.println("（4）构造方法执行后 msg = " + this.msg);
		print();
	}
	public abstract void print();
}
