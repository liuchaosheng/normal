package club.zylearn.maven.dom4jdemo.demo1.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import club.zylearn.maven.dom4jdemo.demo1.vo.Person;

public class TransformToList {
	// 将一个xml文件转换成为person的集合返回
	public List<Person> transfrom(String path) throws Exception{
		List<Person> persons = new ArrayList<Person>() ;
		InputStream in = new FileInputStream(path) ;
		SAXReader sax = new SAXReader() ;
		Document document = sax.read(in) ;
		// 获取根元素
		Element personsElement = document.getRootElement() ;
		
		// 获取person子元素集合
		List<Element> personElementList = personsElement.elements("person") ;
		System.out.println(personElementList.getClass().getName());
		
		Iterator<Element> iter = personElementList.iterator() ;
		while(iter.hasNext()) {
			Person person = new Person() ;
			Element personElement = iter.next() ;
			person.setName(personElement.elementText("name"));
			person.setAge(Integer.parseInt(personElement.elementText("age")));
			person.setSal(Double.parseDouble(personElement.elementText("sal")));
			persons.add(person) ;
		}
		in.close(); 
		return persons ;
	}
	// 将一个person集合输出成为path指定的xml文件
	public void transformToFile(List<Person> persons,String path) throws Exception{
		File file = new File(path);
		File parentPath = file.getParentFile() ;
		if(!parentPath.exists()) {
			parentPath.mkdirs() ;
		}
		if(!file.exists()) {
			file.createNewFile() ;
		}
		OutputStream os = new FileOutputStream(file) ;
		
		// 创建文档对象
		Document document = DocumentHelper.createDocument() ;
		Element personsElement = document.addElement("persons") ;
		// 遍历集合对象
		for(Person p : persons) {
			Element personElement = personsElement.addElement("person") ;
			Element nameElement = personElement.addElement("name") ;
			Element ageElement = personElement.addElement("age") ;
			Element salElement = personElement.addElement("sal") ;
			nameElement.addText(p.getName()) ;
			ageElement.addText(String.valueOf(p.getAge()));
			salElement.addText(String.valueOf(p.getSal())) ;
		}
		OutputFormat format = OutputFormat.createPrettyPrint() ;
		format.setEncoding("utf-8");
		XMLWriter out = new XMLWriter(os,format) ;
		out.write(document);
		out.close(); 
	}
}
