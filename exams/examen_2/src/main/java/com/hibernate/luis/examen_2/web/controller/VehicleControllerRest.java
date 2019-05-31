package com.hibernate.luis.examen_2.web.controller;

import com.hibernate.luis.examen_2.model.SegmentCategory;
import com.hibernate.luis.examen_2.persistence.entity.Vehicle;
import com.hibernate.luis.examen_2.persistence.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
public class VehicleControllerRest {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(path = "/vehicle")
    public Collection<Vehicle> listVehicle (){
        Collection<Vehicle> vehicleList;
        vehicleList = vehicleService.listVehicle();
        //return vehicleList;
        return vehicleList;
    }

    @GetMapping(path = "/contains")
    public String contain (){
        Collection<Vehicle> vehicleList;
        vehicleList = vehicleService.listVehicle();
        if(vehicleList.size() == 0){
            return "La lista esta vacía";
        }
        return "La lista contiene " + vehicleList.size() + " elementos.";
    }

    @GetMapping(path = "/find")
    public Optional<Vehicle> find(){
        return vehicleService.findVehicle(1);

    }

}



//        List<Vehicle> lista = new ArrayList<>();
//        Vehicle a = new Vehicle();
//        a.setModel("Model");
//        a.setNumberOfDoors("4");
//        a.setSegmentCategory(SegmentCategory.HATCHBACK);
//        a.setVersion("EXPACK");
//        a.setWheel(null);
//        a.setYearModel(2019);
//
//
//        Vehicle b = new Vehicle();
//        b.setModel("Model");
//        b.setNumberOfDoors("4");
//        b.setSegmentCategory(SegmentCategory.HATCHBACK);
//        b.setVersion("EXPACK");
//        b.setWheel(null);
//        b.setYearModel(2019);
//
//        lista.add(a);
//        lista.add(b);