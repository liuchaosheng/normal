/*
copyright 
*/

package club.zylearn.view.impl;

import java.util.Map;
import java.util.List;
import club.zylearn.util.ConsoleStream;
import club.zylearn.view.View;
import club.zylearn.vo.Person;
import club.zylearn.controller.Controller;

// ������ͼ�Ľӿ�
public class PreAddPersonView implements View{
	private Controller controller;
	public void setController(Controller controller){
		this.controller = controller;
	}
	public PreAddPersonView(Controller controller){
		this.controller = controller;
	}
	// ʹ�ô��������ģ�ͽ�����Ⱦ
	@Override
	public void render(Map<String,Object> model){
		System.out.println(View.DET + "������Ա" + View.DET);
		String pidStr = ConsoleStream.getInputString("������Ա��ţ�");
		Integer pid = Integer.parseInt(pidStr);
		String name = ConsoleStream.getInputString("������Ա������");
		String ageStr = ConsoleStream.getInputString("�������䣺");
		Integer age = Integer.parseInt(ageStr);
		String salStr = ConsoleStream.getInputString("���빤�ʣ�");
		Double sal = Double.parseDouble(salStr);
		Person newPerson = new Person(pid,name,age,sal);
		// ���ÿ����������ӷ���
		controller.add(newPerson);
	}
}