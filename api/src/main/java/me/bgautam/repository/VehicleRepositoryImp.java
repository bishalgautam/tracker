package me.bgautam.repository;

import me.bgautam.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bishalgautam on 6/26/17.
 */

@Repository
public class VehicleRepositoryImp implements VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public Vehicle findOne(String vim) {
        return  entityManager.find(Vehicle.class, vim);
    }

    public Vehicle createOne(Vehicle vehicle){
        entityManager.persist(vehicle);
        return vehicle;
    }

    public Vehicle updateOne(Vehicle vehicle) {
        return entityManager.merge(vehicle);
    }
}
