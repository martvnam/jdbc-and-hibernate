package pl.sda.orange2.dao;

import java.util.List;

public interface DataAcess<E, ID> {
    void save(E E) {
    }
    List<E> findAll() {
        return List.of();
    }

    E findById(ID id) {
        return null;
    }

    void deleteById(ID id) {

    }
}
