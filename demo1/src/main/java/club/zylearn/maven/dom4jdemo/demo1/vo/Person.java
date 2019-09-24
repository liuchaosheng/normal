package club.zylearn.maven.dom4jdemo.demo1.vo;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name ;
	private Integer age ;
	private Double sal  ;
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
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}
}
