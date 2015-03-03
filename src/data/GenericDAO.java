package data;
import java.util.List;
/**
 * Created by steampilot on 03.03.15.
 */
public interface GenericDAO<T> {
    public boolean delete(long id);
    public List<T> getAll();
    public T getOne(long id);
    public boolean insert (T object);
}
