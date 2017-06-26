package me.bgautam.service;

import me.bgautam.entity.Vehicle;
import me.bgautam.exception.BadRequestException;
import me.bgautam.exception.ResourceNotFoundException;
import me.bgautam.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bishalgautam on 6/26/17.
 */

@Service
public class VehicleServiceImp implements  VehicleService {

    @Autowired
    VehicleRepository repository;

    @Transactional
    public List<Vehicle> putAll(List<Vehicle> vehicles){

        if(vehicles == null || vehicles.size() == 0){
            throw new BadRequestException("PUT request must have a body");
        }

        for (Vehicle veh : vehicles) {
                Vehicle exist = this.findOne(veh.getVin());
                if (exist == null) {
                    this.createOne(veh);
                } else {
                    this.updateOne(veh);
                }
            }
        return vehicles;
    }

    public Vehicle findOne(String vim) {
        return repository.findOne(vim);
    }

    @Transactional
    public Vehicle createOne(Vehicle vehicle) {
        Vehicle existing = this.findOne(vehicle.getVin());

        if(existing != null){
            // 404
            throw new BadRequestException("Vehicle with vin " + vehicle.getVin() + "already exists");
        }
        return repository.createOne(vehicle);
    }

    @Transactional
    public Vehicle updateOne(Vehicle vehicle) {
        Vehicle existing = this.findOne(vehicle.getVin());
        if(existing == null){
            // no resource
            throw new ResourceNotFoundException("No Vehicle with  vin " + vehicle.getVin() + " found");
        }
        return repository.updateOne(vehicle);
    }
}
