package com.hibernate.luis.examen_2.persistence.dao;

import java.util.Collection;
import java.util.Optional;

public interface IVehicleDao<T>{
    Optional<T> get (long id);
    Collection<T> getAll();
    int Save(T t);
    void delete (T t);
}
