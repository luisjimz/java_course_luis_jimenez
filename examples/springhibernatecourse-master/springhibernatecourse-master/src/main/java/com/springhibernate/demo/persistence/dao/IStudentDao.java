package com.springhibernate.demo.persistence.dao;

import java.util.Collection;
import java.util.Optional;

public interface IStudentDao<T> extends Dao {
    Optional<T> get(long id);
    Collection<T> getAll();
    int save(T t);
    void delete(T t);
}
