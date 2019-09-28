package club.zylearn.vo;

public class Person implements Comparable<Person> {
	private String name;
	private Integer age;
	public Person() {
	}
	public Person(String name,Integer age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "姓名：" + this.name + "，年龄：" + this.age;
	}
	// 实现比较方法
	@Override
	public int compareTo(Person o) {
		int ret = 0;
		ret = this.name.compareTo(o.name);
		if(ret != 0) {
			return ret;
		}
		ret = this.age.compareTo(o.getAge());
		return ret;
	}
	// 定义静态方法
	public static Boolean isPersonAge(Integer age) {
		if(age > 0 && age < 150) {
			return true;
		}
		return false;
	}
}
