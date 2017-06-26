package me.bgautam.repository;

import me.bgautam.entity.Vehicle;

/**
 * Created by bishalgautam on 6/26/17.
 */
public interface VehicleRepository {

    Vehicle findOne(String vim);

    Vehicle createOne(Vehicle vehicle);

    Vehicle updateOne(Vehicle veh);
}
