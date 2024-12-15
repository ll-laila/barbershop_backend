package com.example.barbershop_bakend;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
