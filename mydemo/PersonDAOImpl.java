/*
copyright 
*/

package club.zylearn.dao.impl;

import java.util.List;
import java.util.ArrayList;
import club.zylearn.vo.Person;
import club.zylearn.dao.IPersonDAO;
import club.zylearn.util.ConsoleLog;

public class PersonDAOImpl implements IPersonDAO{
	private List<Person> persons = new ArrayList<Person>();
	@Override
	public boolean doCreate(Person vo){
		ConsoleLog.info("正在添加人员信息...");
		if(vo == null){
			ConsoleLog.info("添加人员信息失败！");
			return false;
		}
		persons.add(vo);
		ConsoleLog.info("添加人员信息成功！");
		return true;
	}
	@Override
	public boolean doUpdate(Person vo){
		ConsoleLog.info("正在修改人员信息...");
		if(vo == null){
			ConsoleLog.info("修改人员信息失败！");
			return false;
		}
		// 遍历集合
		for(Person person : persons){
			if(vo.getPid().equals(person.getPid())){
				// 如果找到对应的pid则进行修改
				person.setName(vo.getName());
				person.setAge(vo.getAge());
				person.setSal(vo.getSal());
				ConsoleLog.info("修改人员信息成功！");
				return true;
			}
		}
		ConsoleLog.info("修改人员信息失败！");
		return false;
	}
	@Override
	public boolean doRemove(Integer pid){
		ConsoleLog.info("正在删除人员信息...");
		if(pid == null){
			ConsoleLog.info("删除人员信息失败！");
			return false;
		}
		Person temp = null;
		for(Person person : persons){
			if(pid.equals(person.getPid())){
				temp = person;
				break;
			}
		}
		if(temp != null){
			persons.remove(temp);
			ConsoleLog.info("删除人员信息成功！");
			return true;
		}
		ConsoleLog.info("删除人员信息失败！");
		return false;
	}
	@Override
	public Person findById(Integer pid){
		ConsoleLog.info("正在查找人员信息...");
		for(Person person : persons){
			if(pid.equals(person.getPid())){
				ConsoleLog.info("找到==>" + person.toString());
				return person;
			}
		}
		ConsoleLog.info("查找人员信息失败！");
		return null;
	}
	@Override
	public List<Person> findAll(){
		return persons;
	}
}