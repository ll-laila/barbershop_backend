package com.example.barbershop_bakend;
import java.time.LocalDate;



public record AppointmentDto(
         Long id,
         String customerName,
         String phone,
         LocalDate appointmentDate,
         int numberOfPeople,
         String serviceType
) {
}
