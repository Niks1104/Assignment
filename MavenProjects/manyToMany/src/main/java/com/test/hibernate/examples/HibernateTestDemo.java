package com.test.hibernate.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.test.hibernate.examples.dto.UserDetails;
import com.test.hibernate.examples.dto.Vehicle;


public class HibernateTestDemo {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        UserDetails user = new UserDetails();
        UserDetails user2 = new UserDetails();
        
        Vehicle vehicle = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        
        vehicle.setVehicleName("Car");
        vehicle.getUser().add(user);
        vehicle.getUser().add(user2);
        
        vehicle2.setVehicleName("Jeep");
        vehicle2.getUser().add(user2);
        vehicle2.getUser().add(user);
        
        user.setUserName("First User");
        user2.setUserName("Second User");
        user.getVehicle().add(vehicle);
        user.getVehicle().add(vehicle2);
        user2.getVehicle().add(vehicle);
        user2.getVehicle().add(vehicle2);
        
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(vehicle);
        session.save(vehicle2);
        session.save(user);
        session.save(user2);
        session.getTransaction().commit();
        session.close();
    }
}
