package me.bgautam.controller;

import me.bgautam.entity.Reading;
import me.bgautam.service.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bishalgautam on 6/26/17.
 */

@RestController
public class ReadingsController {

    @Autowired
    ReadingsService readingsService;

    @RequestMapping(method =  RequestMethod.POST,value = "/readings" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @CrossOrigin
    public Reading create(@RequestBody Reading reading){
        return readingsService.create(reading);
    }

}
