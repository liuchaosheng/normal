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
public class IndexView implements View{
	private Controller controller;
	public void setController(Controller controller){
		this.controller = controller;
	}
	public IndexView(Controller controller){
		this.controller = controller;
	}
	// 使用传入的数据模型进行渲染
	@Override
	public void render(Map<String,Object> model){
		List<Person> persons = (List<Person>)model.get("persons");
		System.out.println(View.DET + "主页" + View.DET);
		for(Person person : persons){
			System.out.println(person);
		}
		System.out.println("1、增加人员信息");
		System.out.println("2、修改人员信息");
		System.out.println("3、删除人员信息");
		System.out.println("4、退出系统");
		String ret = ConsoleStream.getInputString("输入选项：");
		int status = Integer.parseInt(ret);
		switch(status){
			case 1:
				controller.dispatcher("preAdd",null);
				break;
			case 2:
				controller.dispatcher("preEdit",null);
				break;
			case 3:
				controller.dispatcher("preDelete",null);
				break;
			default:
				System.exit(0);
		}
	}
}