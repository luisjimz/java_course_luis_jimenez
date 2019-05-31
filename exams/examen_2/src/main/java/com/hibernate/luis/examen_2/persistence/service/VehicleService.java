package com.hibernate.luis.examen_2.persistence.service;

import com.hibernate.luis.examen_2.persistence.dao.IVehicleDao;
import com.hibernate.luis.examen_2.persistence.entity.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
@Slf4j
public class VehicleService {

    @Autowired
    private IVehicleDao vehicleDao;

    @Transactional
    public Collection<Vehicle> listVehicle(){
        Collection<Vehicle> vehiclesDaoAll = vehicleDao.getAll();
        return vehiclesDaoAll;
    }

    @Transactional
    public Optional<Vehicle> findVehicle(long id){
        return vehicleDao.get(id);
    }

    @Transactional
    public void remove (Vehicle vehicle){
        vehicleDao.delete(vehicle);
    }

}
