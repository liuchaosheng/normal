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
public class PreDeletePersonView implements View{
	private Controller controller;
	public void setController(Controller controller){
		this.controller = controller;
	}
	public PreDeletePersonView(Controller controller){
		this.controller = controller;
	}
	// ʹ�ô��������ģ�ͽ�����Ⱦ
	@Override
	public void render(Map<String,Object> model){
		System.out.println(View.DET + "ɾ����Ա" + View.DET);
		String pidStr = ConsoleStream.getInputString("����ɾ����Ա��ţ�");
		Integer pid = Integer.parseInt(pidStr);
		controller.delete(pid);
	}
}