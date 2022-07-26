package services.managers;

import model.entities.Entity;
import model.enums.SortType;

import java.util.List;

public interface Manager<E extends Entity> {
    void add(E entity);
    E remove(E entity);
    List<E> getAll();
    E getById(Long id);
    List<E> getBySort(SortType sortType);
}
