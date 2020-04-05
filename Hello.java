class Hello{
	public static String sName = "Hello - static - field";
	private String name = "Hello - private - field";
	public Hello(){}
	public Hello(String name){
		this.name = name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public static void main(String args[]){
		System.out.println(sName);
		Hello hello = new Hello();
		System.out.println(hello.getName());
	}
	public static void vvvFun(){
		System.out.println("我是用户2提交的代码！");
	}
}