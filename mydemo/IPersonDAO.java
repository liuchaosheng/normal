/*
copyright 
*/

package club.zylearn.dao;

import java.util.List;
import club.zylearn.vo.Person;

public interface IPersonDAO{
	public boolean doCreate(Person vo);
	public boolean doUpdate(Person vo);
	public boolean doRemove(Integer pid);
	public Person findById(Integer pid);
	public List<Person> findAll();
}