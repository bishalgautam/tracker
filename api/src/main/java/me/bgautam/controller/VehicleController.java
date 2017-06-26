package me.bgautam.controller;

import me.bgautam.entity.Vehicle;
import me.bgautam.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bishalgautam on 6/26/17.
 */
@RestController
public class VehicleController {

    @Autowired
    VehicleService service;

    @RequestMapping(method = RequestMethod.GET, value = "/vehicles", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> getAll() {
        return null;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/vehicles", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> putAll(@RequestBody List<Vehicle> vehicles) {
        return service.putAll(vehicles);
    }
}