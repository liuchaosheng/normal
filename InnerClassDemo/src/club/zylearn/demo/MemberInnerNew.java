package club.zylearn.demo;

public class MemberInnerNew {
	public static void main(String[] args) {
		// 成员内部类的外部实例化方式
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}
}
