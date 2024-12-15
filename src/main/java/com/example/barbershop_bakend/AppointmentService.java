package com.example.barbershop_bakend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;


    public AppointmentDto createAppointment(AppointmentDto appointmentDto) {
        Appointment appointmentEntity = new Appointment(
                null,
                appointmentDto.customerName(),
                appointmentDto.phone(),
                appointmentDto.appointmentDate(),
                appointmentDto.numberOfPeople(),
                appointmentDto.serviceType()
        );

        Appointment savedAppointment = appointmentRepository.save(appointmentEntity);

        return new AppointmentDto(
                savedAppointment.getId(),
                savedAppointment.getCustomerName(),
                savedAppointment.getPhone(),
                savedAppointment.getAppointmentDate(),
                savedAppointment.getNumberOfPeople(),
                savedAppointment.getServiceType());
    }





    public List<AppointmentDto> getAllAppointments() {
        List<Appointment> appointments = appointmentRepository.findAll();
        return appointments.stream()
                .map(appointment -> new AppointmentDto(
                        appointment.getId(),
                        appointment.getCustomerName(),
                        appointment.getPhone(),
                        appointment.getAppointmentDate(),
                        appointment.getNumberOfPeople(),
                        appointment.getServiceType()))
                .collect(Collectors.toList());
    }



}
