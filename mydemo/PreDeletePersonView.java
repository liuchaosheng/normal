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
public class PreDeletePersonView implements View{
	private Controller controller;
	public void setController(Controller controller){
		this.controller = controller;
	}
	public PreDeletePersonView(Controller controller){
		this.controller = controller;
	}
	// 使用传入的数据模型进行渲染
	@Override
	public void render(Map<String,Object> model){
		System.out.println(View.DET + "删除人员" + View.DET);
		String pidStr = ConsoleStream.getInputString("输入删除人员编号：");
		Integer pid = Integer.parseInt(pidStr);
		controller.delete(pid);
	}
}