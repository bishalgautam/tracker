package me.bgautam.service;

import me.bgautam.entity.Reading;
import me.bgautam.exception.BadRequestException;
import me.bgautam.repository.ReadingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bishalgautam on 6/27/17.
 */

@Service
public class ReadingsServiceImp implements  ReadingsService{

    @Autowired
     ReadingsRepository readingsRepository;

    @Transactional
    public Reading create(Reading reading) {

        if (reading == null){
            throw  new BadRequestException("The payload cannot be empty");
        }
        return readingsRepository.create(reading);
    }
}
