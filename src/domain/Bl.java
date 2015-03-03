package domain;

import java.util.List;

import bo.Person;
import data.PersonDAO;
import data.PersonDAOImpl;
public class Bl {
	private PersonDAO dal = new PersonDAOImpl();

    public Person getByName(String name) {
        return dal.getByName(name);
    }
	
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
