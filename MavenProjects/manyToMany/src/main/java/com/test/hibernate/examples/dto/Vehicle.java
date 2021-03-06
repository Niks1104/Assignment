package com.test.hibernate.examples.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_MM")
public class Vehicle 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="VEHICLE_ID")
    private int vehicleId;
    
    @Column(name="VEHICLE_NAME")
    private String vehicleName;
    
    @ManyToMany(mappedBy="vehicle")
    private Collection<UserDetails> user = new ArrayList<UserDetails>();
    
    public Collection<UserDetails> getUser() {
        return user;
    }
    public void setUser(Collection<UserDetails> user) {
        this.user = user;
    }
    public int getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleName() {
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
