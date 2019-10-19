public class Demo02{
	public static void main(String args[]){
		System.out.println(Demo02.class.getClassLoader());  // app classloader 
		System.out.println(Demo02.class.getClassLoader().getParent());  // ext classloader
		System.out.println(Demo02.class.getClassLoader().getParent().getParent());  // bootstrap classloader

		System.out.println(System.getProperty("java.class.path"));
	}
}