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

// 关于视图的接口
public class PreAddPersonView implements View{
	private Controller controller;
	public void setController(Controller controller){
		this.controller = controller;
	}
	public PreAddPersonView(Controller controller){
		this.controller = controller;
	}
	// 使用传入的数据模型进行渲染
	@Override
	public void render(Map<String,Object> model){
		System.out.println(View.DET + "增加人员" + View.DET);
		String pidStr = ConsoleStream.getInputString("输入人员编号：");
		Integer pid = Integer.parseInt(pidStr);
		String name = ConsoleStream.getInputString("输入人员姓名：");
		String ageStr = ConsoleStream.getInputString("输入年龄：");
		Integer age = Integer.parseInt(ageStr);
		String salStr = ConsoleStream.getInputString("输入工资：");
		Double sal = Double.parseDouble(salStr);
		Person newPerson = new Person(pid,name,age,sal);
		// 调用控制器的增加方法
		controller.add(newPerson);
	}
}