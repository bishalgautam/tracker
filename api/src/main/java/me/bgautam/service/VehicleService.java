package me.bgautam.service;

import me.bgautam.entity.Vehicle;

import java.util.List;

/**
 * Created by bishalgautam on 6/26/17.
 */
public interface VehicleService {

    Vehicle findOne(String vim);

    Vehicle createOne(Vehicle vehicle);

    Vehicle updateOne(Vehicle veh);

    List<Vehicle> putAll(List<Vehicle> vehicles);
}
