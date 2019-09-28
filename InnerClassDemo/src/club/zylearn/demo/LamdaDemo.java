package club.zylearn.demo;

public class LamdaDemo {
	private IDemo demo = new IDemo() {
		@Override
		public void demo() {
			System.out.println("使用匿名内部类实例化的IDemo接口");
		}
	};
	private IDemo demoLamda = () -> {System.out.println("使用Lamda表达式实例化的IDemo接口");};
	public void doDemo() {
		demo.demo();
		demoLamda.demo();
	}
}
