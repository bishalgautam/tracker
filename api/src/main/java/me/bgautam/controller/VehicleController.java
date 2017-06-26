package me.bgautam.controller;

import me.bgautam.entity.Vehicle;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by bishalgautam on 6/26/17.
 */
@RestController
public class VehicleController {

    @RequestMapping(method = RequestMethod.GET, value ="/vehicles", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> insertAll(){

        return null;
    }
}
