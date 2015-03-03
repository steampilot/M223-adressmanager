package data;
import bo.Person;

/**
 * Created by steampilot on 03.03.15.
 */
public interface PersonDAO extends GenericDAO<Person> {
    public Person getByName(String Name);
}
