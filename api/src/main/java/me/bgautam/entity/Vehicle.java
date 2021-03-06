package me.bgautam.entity;

import javax.persistence.*;

/**
 * Created by bishalgautam on 6/26/17.
 */

@Entity
@NamedQueries({

})
public class Vehicle {

    @Id
    @Column(columnDefinition = "CHAR(17)")
    private String vin;

    @Column(columnDefinition =  "VARCHAR(32)")
    private String make;

    @Column(columnDefinition =  "VARCHAR(32)")
    private String model;
    private int year;
    private int redlineRpm;
    private double maxFuelVolume;

    @Column(columnDefinition = "CHAR(24)")
    private String lastServiceDate;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRedlineRpm() {
        return redlineRpm;
    }

    public void setRedlineRpm(int redlineRpm) {
        this.redlineRpm = redlineRpm;
    }

    public double getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(double maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }


}
