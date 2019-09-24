package club.zylearn.maven.dom4jdemo.demo1.vo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person person = new Person() ;
		person.setName("朝阳");
		person.setAge(30);
		person.setSal(9000.0);
		System.out.println(person);
	}

}
