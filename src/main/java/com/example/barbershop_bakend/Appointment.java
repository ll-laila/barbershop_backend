package com.example.barbershop_bakend;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String phone;
    private LocalDate appointmentDate;
    private int numberOfPeople;
    private String serviceType;



    public Appointment() {
    }


    public Appointment(Long id, String customerName, String phone, LocalDate appointmentDate, int numberOfPeople, String serviceType) {
        this.id = id;
        this.customerName = customerName;
        this.phone = phone;
        this.appointmentDate = appointmentDate;
        this.numberOfPeople = numberOfPeople;
        this.serviceType = serviceType;
    }





    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

}
