package me.bgautam.repository;

import me.bgautam.entity.Reading;
import me.bgautam.entity.Tyre;
import me.bgautam.entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by bishalgautam on 6/27/17.
 */
@Repository
public class ReadingsRepositoryImp  implements  ReadingsRepository{

    @PersistenceContext
     private EntityManager entityManager;

    public Reading create(Reading reading) {

        Tyre temp = reading.getTires();
        entityManager.persist(temp);

        // set the LOW , MEDIUM and HIGH priority alerts
        Vehicle vehicle = entityManager.find(Vehicle.class, reading.getVin());

        if(reading.getEngineRpm() > vehicle.getRedlineRpm()){
            reading.setAlert(true);
            reading.setPriority("HIGH");
        }else if (reading.getFuelVolume() < (vehicle.getMaxFuelVolume() * 0.1)){
            reading.setAlert(true);
            reading.setPriority("MEDIUM");
        }
        else if(temp.getFrontLeft() < 32 || temp.getFrontLeft() > 36 || temp.getFrontRight() < 32
                || temp.getFrontRight() > 36 || temp.getRearLeft() < 32 || temp.getRearLeft() > 36 || temp.getRearRight() < 32 || temp.getRearRight() > 36){
            reading.setAlert(true);
            reading.setPriority("LOW");
        }else if(reading.isCheckEngineLightOn() || reading.isEngineCoolantLow()){
            reading.setAlert(true);
            reading.setPriority("LOW");
        }
        entityManager.persist(reading);
        return reading;
    }
}
