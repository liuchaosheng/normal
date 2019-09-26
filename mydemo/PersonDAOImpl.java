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
		ConsoleLog.info("���������Ա��Ϣ...");
		if(vo == null){
			ConsoleLog.info("�����Ա��Ϣʧ�ܣ�");
			return false;
		}
		persons.add(vo);
		ConsoleLog.info("�����Ա��Ϣ�ɹ���");
		return true;
	}
	@Override
	public boolean doUpdate(Person vo){
		ConsoleLog.info("�����޸���Ա��Ϣ...");
		if(vo == null){
			ConsoleLog.info("�޸���Ա��Ϣʧ�ܣ�");
			return false;
		}
		// ��������
		for(Person person : persons){
			if(vo.getPid().equals(person.getPid())){
				// ����ҵ���Ӧ��pid������޸�
				person.setName(vo.getName());
				person.setAge(vo.getAge());
				person.setSal(vo.getSal());
				ConsoleLog.info("�޸���Ա��Ϣ�ɹ���");
				return true;
			}
		}
		ConsoleLog.info("�޸���Ա��Ϣʧ�ܣ�");
		return false;
	}
	@Override
	public boolean doRemove(Integer pid){
		ConsoleLog.info("����ɾ����Ա��Ϣ...");
		if(pid == null){
			ConsoleLog.info("ɾ����Ա��Ϣʧ�ܣ�");
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
			ConsoleLog.info("ɾ����Ա��Ϣ�ɹ���");
			return true;
		}
		ConsoleLog.info("ɾ����Ա��Ϣʧ�ܣ�");
		return false;
	}
	@Override
	public Person findById(Integer pid){
		ConsoleLog.info("���ڲ�����Ա��Ϣ...");
		for(Person person : persons){
			if(pid.equals(person.getPid())){
				ConsoleLog.info("�ҵ�==>" + person.toString());
				return person;
			}
		}
		ConsoleLog.info("������Ա��Ϣʧ�ܣ�");
		return null;
	}
	@Override
	public List<Person> findAll(){
		return persons;
	}
}