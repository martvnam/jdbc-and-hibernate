package pl.sda.orange2.dao;

import java.util.List;

public interface DataAccess<E, ID> {
    void save(E car);

    List<E> findAll();

    E findById(ID id);

    void deleteById(ID id);
}
