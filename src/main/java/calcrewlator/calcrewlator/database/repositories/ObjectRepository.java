package calcrewlator.calcrewlator.database.repositories;

import java.util.List;

public interface ObjectRepository<T> {
    
    public int save(T t);

    public int update(T t);

    public T findById(int id);

    public int deleteById(int id);

    List<T> findAll();

}
