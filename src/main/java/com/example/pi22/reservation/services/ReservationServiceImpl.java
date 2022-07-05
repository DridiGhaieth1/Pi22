package com.example.pi22.reservation.services;

import com.example.pi22.reservation.entities.Reservation;
import com.example.pi22.reservation.repo.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public void addReservation(Reservation r) {
        reservationRepository.save(r);
    }

    @Override
    public void updateReservation(Reservation r) {
        reservationRepository.save(r);
    }

    @Override
    public Reservation getReservation(Long id) {
        return  reservationRepository.findById(Math.toIntExact(id)).get();
    }

    @Override
    public void deleteReservation(Reservation r) {
        reservationRepository.delete(r);
    }

    @Override
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(Math.toIntExact(id));
    }

    @Override
    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }
}
