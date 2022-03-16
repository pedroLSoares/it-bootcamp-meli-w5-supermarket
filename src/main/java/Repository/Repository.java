package Repository;

import java.util.ArrayList;

public interface Repository<T> {
    public void create(T obj);
    public ArrayList<T> read();
    public T find(int id);
    public void update(T obj);
    public void delete(T obj);
}
