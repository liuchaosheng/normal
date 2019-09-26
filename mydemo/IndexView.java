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
public class IndexView implements View{
	private Controller controller;
	public void setController(Controller controller){
		this.controller = controller;
	}
	public IndexView(Controller controller){
		this.controller = controller;
	}
	// ʹ�ô��������ģ�ͽ�����Ⱦ
	@Override
	public void render(Map<String,Object> model){
		List<Person> persons = (List<Person>)model.get("persons");
		System.out.println(View.DET + "��ҳ" + View.DET);
		for(Person person : persons){
			System.out.println(person);
		}
		System.out.println("1��������Ա��Ϣ");
		System.out.println("2���޸���Ա��Ϣ");
		System.out.println("3��ɾ����Ա��Ϣ");
		System.out.println("4���˳�ϵͳ");
		String ret = ConsoleStream.getInputString("����ѡ�");
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