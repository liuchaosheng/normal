/*
copyright 
*/

package club.zylearn.vo;

// 用户2增加了Person.java的注释

public class Person{
	private Integer pid;
	private String name;
	private Integer age;
	private Double sal;
	public Person(){
		
	}
	public Person(Integer pid,String name,Integer age,Double sal){
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPid(Integer pid){
		this.pid = pid;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getAge(){
		return this.age;
	}
	public void setAge(Integer age){
		this.age = age;
	}
	public Double getSal(){
		return this.sal;
	}
	public void setSal(Double sal){
		this.sal = sal;
	}
	// ¸²Ð´equals·½·¨
	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(! (obj instanceof Person)){
			return false;
		} 
		if(obj == this){
			return true;
		}
		Person p = (Person)obj;
		if(this.getName().equals(p.getName()) && this.getAge().equals(p.getAge()) &&
				this.getSal().equals(p.getSal()) && this.getPid().equals(p.getPid())){
			return true;		
		}
		return false;
	}
	@Override
	public String toString(){
		return "¡¾ÈËÔ±±àºÅ£º" + this.pid + "£¬ÐÕÃû£º" + this.name + "£¬ÄêÁä£º" + this.age + "£¬¹¤×Ê£º" + this.sal + "¡¿"; 
	}
}