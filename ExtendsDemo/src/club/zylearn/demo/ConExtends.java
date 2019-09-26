package club.zylearn.demo;

public class ConExtends extends ConProcess{
	private int num = 1000;
	{
		System.out.println("（1）构造块执行前 num = " + this.num);
		this.num = 10;
		System.out.println("（2）构造块执行后 num = " + this.num);
	}
	public ConExtends(String msg) {
		super(msg);
		System.out.println("（3）子类构造方法执行");
	}
	@Override
	public void print() {
		System.out.println("在父类构造中执行print  num = " + this.num);
	}
}
