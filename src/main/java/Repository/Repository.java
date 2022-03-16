package Repository;

import java.util.ArrayList;
import java.util.Optional;

public interface Repository<T> {
    public void create(T obj);
    public ArrayList<T> read();
    public Optional<T> find(int id);
    public void update(T obj);
    public void delete(T obj);
}
