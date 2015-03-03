package data;

import java.util.ArrayList;
import java.util.List;

import bo.BusinessObject;
import bo.Person;

public class GenericDAOImpl<T extends BusinessObject> implements GenericDAO<T> {
    private long nextId = 1;
    protected ArrayList<T> persons = new ArrayList<T>();

    public synchronized boolean delete(long id) {
        for (int i = 0; i < persons.size(); i++) {
            T person = persons.get(i);
            if (person.getId() == id) {
                persons.remove(i);
                return true;
            }
        }
        return false;
    }

    public synchronized List<T> getAll() {
        return persons;
    }

    public synchronized T getOne(long id) {
        for (int i = 0; i < persons.size(); i++) {
            T person = persons.get(i);
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public synchronized boolean insert(T obj) {
        obj.setId(nextId);
        nextId++;
        return persons.add(obj);
    }
}