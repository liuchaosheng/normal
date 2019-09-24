/*
 *  copyright  www.zylearn.club 2019-2020
 */

package datatype;

/**
 * 学习代码块的测试主类
 * @author 朝阳
 * @since [09-24]
 * @version [1.0]
 */
public class CodeBlock {
	/**
	 * 程序执行入口
	 * @param args 命令行传入参数构成的字符串数组
	 */
	public static void main(String[] args) {
		// 测试静态块，构造块，普通块
		InnerCodeBlock.println("测试类是否加载。。。。");
		InnerCodeBlock innerObject = new InnerCodeBlock();
		innerObject.test();
		
		/* 测试同步块*/
		// 使用匿名内部类创建Runnable实例，线程主体类
		Runnable run = new Runnable() {
			@Override
			public void run() {
				// 循环买票十次
				for(int i = 0 ; i < 10 ; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					InnerCodeBlock.sell();
				}
			}
		};
		
		// 启动两个线程卖票
		new Thread(run,"卖票线程1").start();
		new Thread(run,"卖票线程2").start();
	}
}

/**
 * 该类中真实的写入了四中代码块
 * @author 朝阳
 * @since [09-24]
 * @version [1.0]
 */
class InnerCodeBlock{
	/*
	 * 用于统计类产生实例个数
	 */
	private static int objectNum;
	
	/*
	 * 定义多线程共同访问的票数
	 */
	private static int ticket = 10;
	
	/*
	 * 用于加锁的对象
	 */
	private static Object lock = new Object();
	
	/*
	 * 类的普通属性
	 */
	private String msg;
	
	/*
	 * 静态代码块，用于初始化objectNum
	 */
	static {
		objectNum = 0;
		println("静态块执行了。。。");
	}
	
	/*
	 * 构造块
	 */
	{
		msg = "构造块中初始化的msg";
		println("构造块执行了。。。");
	}
	
	/**
	 * 默认构造方法
	 */
	public InnerCodeBlock(){
		objectNum++;
		InnerCodeBlock.println("实例化了" + objectNum + "个对象了。。。");
	}
	
	/**
	 * 静态方法 用于打印对象
	 * @param o 待打印对象
	 */
	public static void println(Object o) {
		System.out.println(o);
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return this.msg;
	}
	
	@Override
	public String toString() {
		return "msg = " + this.msg;
	}
	
	/**
	 * 该方法用于测试普通代码块的使用
	 */
	public void test() {
		int data = 200;
		{
			InnerCodeBlock.println("在普通代码块中访问了test方法作用域中的内容：" + data);
			String msg = "普通代码块的中的msg";
			InnerCodeBlock.println(msg);
		}
		String msg = "test方法中定义的msg";
		InnerCodeBlock.println(msg);
		InnerCodeBlock.println(this.msg);
	}
	
	/**
	 * 供多线程调用的方法入口
	 */
	public static void sell() {
		// 同步块的使用，关键点在于所有访问共享资源的线程必须锁同一个对象
		synchronized(lock) {
			println(Thread.currentThread().getName() + "卖票了：");
			if(ticket > 0) {
				println("有票，卖出第" + ticket + "张票。。。");
				ticket--;
			}else {
			   println("无票，卖票失败！");
			}
			println(Thread.currentThread().getName() + "结束买票。。。。。");
		}
	}
}
