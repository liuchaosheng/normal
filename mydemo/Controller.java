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

// 关于视图的接口
public class Controller{
	private Map<String,View> viewsMap = new HashMap<String,View>();
	private IPersonDAO dao = new PersonDAOImpl();
	// 默认构造函数
	public Controller(){
		// 初始化所有数据
		dao.doCreate(new Person(1111,"张三",19,4000.0));
		dao.doCreate(new Person(1112,"朝阳",39,4000.0));
		dao.doCreate(new Person(1113,"李四",22,3800.0));
		dao.doCreate(new Person(1114,"john",31,6000.0));
		dao.doCreate(new Person(1115,"李兴华",23,9000.0));
		
		// 该构造方法中要负责实例化所有的视图信息
		viewsMap.put("preAdd",new PreAddPersonView(this));
		viewsMap.put("preEdit",new PreEditPersonView(this));
		viewsMap.put("preDelete",new PreDeletePersonView(this));
		viewsMap.put("index",new IndexView(this));
	}
	// 增加
	public void add(Person vo){
		dao.doCreate(vo);
		// 服务器跳转
		index();
	}
	// 修改
	public void edit(Person vo){
		dao.doUpdate(vo);
		index();
	}
	// 删除
	public void delete(Integer pid){
		dao.doRemove(pid);
		index();
	}
	// 列表
	public void index(){
		Map<String,Object> model = new HashMap<String,Object>();
		List<Person> persons = dao.findAll();
		model.put("persons",persons);
		// 跳转到主页
		dispatcher("index",model);
	}
	// 视图跳转
	public void dispatcher(String viewName,Map<String,Object> model){
		View view = (View)this.viewsMap.get(viewName);
		if(view != null){
			// 渲染视图
			view.render(model);
		}
	}
}