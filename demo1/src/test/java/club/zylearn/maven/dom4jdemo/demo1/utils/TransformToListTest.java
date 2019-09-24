package club.zylearn.maven.dom4jdemo.demo1.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import club.zylearn.maven.dom4jdemo.demo1.vo.Person;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransformToListTest {

	@Test
	public void test02() throws Exception {  //  testTransfrom
		TransformToList tran = new TransformToList() ;
		String path = System.getProperty("user.dir") + File.separator + "persons.xml" ;
		System.out.println(path + "=========");
		List<Person> persons = tran.transfrom(path) ;
		for(Person p : persons) {
			System.out.println(p);
		}
	}

	@Test
	public void test01() throws Exception {  // testTransformToFile
		List<Person> persons = new ArrayList<Person>();
		for(int i = 0 ; i < 10 ; i++) {
			String name = "朝阳-" + i ;
			int age = i + 20 ;
			double sal = 6000.0 ;
			Person p = new Person() ;
			p.setName(name);
			p.setAge(age);
			p.setSal(sal);
			persons.add(p) ;
		}
//		String classpath = Person.class.getResource(File.separator).getPath() ;
//		System.out.println(classpath);
//		classpath = classpath + "persons.xml" ;
//		System.out.println(classpath);
		String path = System.getProperty("user.dir") + File.separator + "persons.xml";
		System.out.println(path);
		TransformToList tran = new TransformToList() ;
		tran.transformToFile(persons, path);
	}

}
