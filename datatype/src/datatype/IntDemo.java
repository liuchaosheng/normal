package datatype;

import java.util.Arrays;
import java.util.Random;

public class IntDemo {

	public static void main(String[] args) {
//		int data = Integer.MIN_VALUE;
//		System.out.println(data);
//		int fix = 1 ;
//		for(int i = 0 ; i < 31 ; i++) {
//			fix = fix * 2 ;
//		}
//		System.out.println(fix);
//		int dataNew = ~data ;
//		System.out.println(dataNew);
		
//		byte data = 127 ;
//		//byte data2 = 128 ;  // 编译报错
//		
//		float f1 = 10f ;
//		System.out.println(f1);
//		
//		float f2 = 10.2f;
//		float f3 = 10.2f ;
//		System.out.println(f2 * f3);
//		
//		System.out.println(10.2 * 10.2);  // 浮点数的乘法运算时有bug的
//		
//		System.out.println(10.0 * 10.0);
//		
//		System.out.println(10 / (double)9);
//		
//		char cdata = (char)10 ;
		
//		Random ran =new Random() ;
//		byte[]  bytes = new byte[5] ;
//		ran.nextBytes(bytes);
//		for(byte b : bytes) {
//			System.out.println(b);
//		}
//		System.out.println("===========");
//		for(byte b : bytes) {
//			int ret = 0x000000ff & b | 0xffffff00 ;
//			System.out.println(Integer.toHexString(ret).substring(6));
//		}
		
//		IDemo d1 = new Demo1() ;
//		IDemo d2 = new Demo2() ;
//		d1.print(); 
//		d2.print(); 
		
		// 数组 
//		int arr[] = new int[] {1,2,3,4,5} ;
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		/*int arr1[] = {1,2,3,4,5} ;
		int arr2[] = {10,9,8,7,6,5,4,3,2} ;
		System.arraycopy(arr1, 0, arr2, 0, 5);
		System.out.println(Arrays.toString(arr2));*/
		
//		Person p1 = new Person("zhangsan",30) ;
//		Person p2 = new Person("lisi",20) ;
//		Person p3 = new Person("wwwus",10) ;
//		Person[] persons =new Person[] {p1,p2,p3} ;
//		Arrays.sort(persons);
//		System.out.println(Arrays.toString(persons));
		
//		String str = new String("abc").intern() ;
//		String str2 = "abc" ;
//		System.out.println(str == str2);
		
//		String arr[] = {"0","abc","java","bdb","中国人","md"} ;
//		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		Person person = new Person() ;
//		person.setAge(30);
//		person.setName("张三");
//		Car car = new Car() ;
//		car.setCname("宝马3系");
//		car.setPrice(9000.0);
//		
//		person.setCar(car);
//		car.setPerson(person);
		
//		System.out.println(car);
//		System.out.println(car.getPerson());
		
//		Person pf = new Person() ;
//		pf.setAge(50);
//		pf.setName("张三爸爸");
//		pf.setCar(null);
//		
//		pf.setFather(null);
//		person.setFather(pf);
//		
//		System.out.println(person);
//		System.out.println("爸爸是 :  " + person.getFather());
//		System.out.println("车是：" + person.getCar());
		
//		Object object = 10 ;
//		System.out.println(object instanceof Integer);
		
//		int a = 10 ;
//		int b = 10 ;
//		switch(a) {
//		case b:{
//			break;
//		}
//		}
		final int aa = 100 ;
		new IDemo() {
			@Override
			public void print() {
				System.out.println("java jsp");
				System.out.println(aa);
			}
		}.print(); 
		
	}
	
	public static int add(int a,int b) {
		return a + b ;
	}
	
	public static double add(double a,double b) {
		return a + b ;
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double a) {
		System.out.println(a);
	}

}

interface IDemo{
	public static final int data = 100 ;
	public abstract void print();
}
class Demo1 implements IDemo{
	public void print() {
		System.out.println(data);
	}
}

class Demo2 implements IDemo{
	public void print() {
		System.out.println(data);
	}
}

class Person implements Comparable<Person>{
	private String name ;
	private int age;
	private Car car ;
	private Person father ;
	
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Person() {}
	public Person(String name,int age) {
		this.name = name ;
		this.age = age ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
}

class Car {
	private String cname ;
	private double price ;
	private Person person ;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "Car [cname=" + cname + ", price=" + price + "]";
	}
}


