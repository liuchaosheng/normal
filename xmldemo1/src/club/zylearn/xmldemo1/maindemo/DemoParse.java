package club.zylearn.xmldemo1.maindemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DemoParse {

	public static void main(String[] args) throws Exception {
//		String classpath = DemoParse.class.getResource("/resources/members.xml").getPath() ;
//		File file = new File(classpath) ;
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance() ;
//		DocumentBuilder builder = factory.newDocumentBuilder() ;
//		InputStream in = new FileInputStream(file) ;
//		Document document = builder.parse(in) ;
//		NodeList nodes = document.getElementsByTagName("member") ;
//		int length = nodes.getLength() ;
//		for(int i = 0 ; i < length ; i++) {
//			Element curElement = (Element)nodes.item(i);
//			System.out.println("编号：" + curElement.getAttribute("id"));
//			System.out.println("名字：" + curElement.getElementsByTagName("name").item(0).getTextContent());
//			System.out.println("年龄：" + curElement.getElementsByTagName("age").item(0).getTextContent());
//			System.out.println("薪资：" + curElement.getElementsByTagName("sal").item(0).getTextContent());
//		}
//		if(in != null) {
//			in.close(); 
//		}
		
		String names[] = {"张三","朝阳","李四"} ;
		int ages[] = {30,29,33} ;
		double sals[] = {9000.0,10000.0,5900.0} ;
		String classpath = DemoParse.class.getResource("/resources").getPath() ;
		File file = new File(classpath + File.separator + "copyMembers.xml") ;
		if(!file.exists()) {
			file.createNewFile() ;
		}
		OutputStream os = new FileOutputStream(file) ;
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance() ;
		DocumentBuilder builder = factory.newDocumentBuilder() ;
		Document document = builder.newDocument() ;
		Element membersElement = document.createElement("members") ;
		int len = names.length ;
		for(int i = 0 ; i < len ; i++) {
			// 创建每一个member元素节点和其中的内容
			Element memberElement = document.createElement("member") ;
			Element nameElement = document.createElement("name");
			Element ageElement = document.createElement("age") ;
			Element salElement = document.createElement("sal") ;
			nameElement.appendChild(document.createTextNode(names[i])) ;
			memberElement.appendChild(nameElement) ;
			
			ageElement.appendChild(document.createTextNode(String.valueOf(ages[i]))) ;
			memberElement.appendChild(ageElement) ;
			
			salElement.appendChild(document.createTextNode(String.valueOf(sals[i]))) ;
			memberElement.appendChild(salElement) ;
			// 将创建的member元素节点添加到根节点中
			membersElement.appendChild(memberElement) ;
		}
		// 将根节点添加到文档中
		document.appendChild(membersElement) ;
		
		// 输出
		TransformerFactory transformerFactory = TransformerFactory.newInstance() ;
		Transformer transformer = transformerFactory.newTransformer() ;
		Source domSource = new DOMSource(document) ;
		Result streamResult = new StreamResult(os) ;
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.transform(domSource, streamResult);
		os.close(); 
	}

}
