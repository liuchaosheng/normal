/*
copyright 
*/

package club.zylearn.controller;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import club.zylearn.view.View;
import club.zylearn.dao.IPersonDAO;
import club.zylearn.dao.impl.PersonDAOImpl;
import club.zylearn.vo.Person;
import club.zylearn.util.ConsoleLog;
import club.zylearn.view.impl.*;

// ������ͼ�Ľӿ�
public class Controller{
	private Map<String,View> viewsMap = new HashMap<String,View>();
	private IPersonDAO dao = new PersonDAOImpl();
	// Ĭ�Ϲ��캯��
	public Controller(){
		// ��ʼ����������
		dao.doCreate(new Person(1111,"����",19,4000.0));
		dao.doCreate(new Person(1112,"����",39,4000.0));
		dao.doCreate(new Person(1113,"����",22,3800.0));
		dao.doCreate(new Person(1114,"john",31,6000.0));
		dao.doCreate(new Person(1115,"���˻�",23,9000.0));
		
		// �ù��췽����Ҫ����ʵ�������е���ͼ��Ϣ
		viewsMap.put("preAdd",new PreAddPersonView(this));
		viewsMap.put("preEdit",new PreEditPersonView(this));
		viewsMap.put("preDelete",new PreDeletePersonView(this));
		viewsMap.put("index",new IndexView(this));
	}
	// ����
	public void add(Person vo){
		dao.doCreate(vo);
		// ��������ת
		index();
	}
	// �޸�
	public void edit(Person vo){
		dao.doUpdate(vo);
		index();
	}
	// ɾ��
	public void delete(Integer pid){
		dao.doRemove(pid);
		index();
	}
	// �б�
	public void index(){
		Map<String,Object> model = new HashMap<String,Object>();
		List<Person> persons = dao.findAll();
		model.put("persons",persons);
		// ��ת����ҳ
		dispatcher("index",model);
	}
	// ��ͼ��ת
	public void dispatcher(String viewName,Map<String,Object> model){
		View view = (View)this.viewsMap.get(viewName);
		if(view != null){
			// ��Ⱦ��ͼ
			view.render(model);
		}
	}
}