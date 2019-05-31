package com.hibernate.luis.examen_2.web.controller;

import com.hibernate.luis.examen_2.persistence.entity.Vehicle;
import com.hibernate.luis.examen_2.persistence.service.VehicleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
@Slf4j
public class VehicleControllerView {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping(path = "/vehicleview")
    public String listVehicle(ModelMap model){
        log.info("Saludos desde /vehicle-view");
        Collection<Vehicle> vehicleList;
        vehicleList = vehicleService.listVehicle();
        model.put("vehicleList", vehicleList);
        return "vehicles";
    }
}
