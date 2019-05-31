package com.hibernate.luis.examen_2.persistence.dao;

import com.hibernate.luis.examen_2.persistence.entity.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component @Slf4j
public class VehicleDao implements IVehicleDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Optional get(long id) {
        //JPQL Query
        Vehicle vehicle = em.createQuery("select vh from Vehicle vh where id = " + id, Vehicle.class).getSingleResult();
        //Hibernate Query
        Vehicle hibernateVehicle = em.find(Vehicle.class, id);
        return Optional.ofNullable(vehicle);
    }

    @Override
    public Collection getAll() {
        log.info("Using Proxies DAO");
        List<Vehicle> vehicleList = em.createQuery("from Vehicle", Vehicle.class).getResultList();
        log.info("Entering Join Fetch DAO");
        List<Vehicle> vehicleList1 = em.createQuery("select distinct vh from Vehicle vh inner join fetch vh.engine", Vehicle.class).getResultList();
        return vehicleList;
    }



    @Override
    public int Save(Object o) {
        return 0;
    }

    @Override
    public void delete(Object o) {

    }
}
