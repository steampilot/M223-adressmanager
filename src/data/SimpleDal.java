package data;

import java.util.ArrayList;
import java.util.List;

import bo.Person;

public class SimpleDal {
	private long nextId = 1;
	private ArrayList<Person> persons = new ArrayList<Person>();

	public synchronized boolean delete(long id) {
		for (int i = 0; i < persons.size(); i++) {
			Person person = persons.get(i);
			if (person.getId() == id) {
				persons.remove(i);
				return true;
			}
		}
		return false;
	}

	public synchronized List<Person> getAll() {
		return persons;
	}

	public synchronized Person getOne(long id) {
		for (int i = 0; i < persons.size(); i++) {
			Person person = persons.get(i);
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

	public synchronized boolean insert(Person person) {
		person.setId(nextId);
		nextId++;
		return persons.add(person);
	}
}
