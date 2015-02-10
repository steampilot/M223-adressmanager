package domain;

import java.util.List;

import bo.Person;
import data.SimpleDal;

public class Bl {
	private SimpleDal dal = new SimpleDal();
	
	
	public boolean deletePerson(long id) {
		return dal.delete(id);
	}

	public List<Person> getAllPersons() {
		return dal.getAll();
	}

	public Person getPerson(long id) {
		return dal.getOne(id);
	}

	public boolean insertPerson(Person person) {
		return dal.insert(person);
	}

}
