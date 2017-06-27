package me.bgautam.repository;

import me.bgautam.entity.Reading;
import me.bgautam.entity.Tyre;
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
        entityManager.persist(reading);
        return reading;
    }
}
