package com.example.pi22.reservation.services;

import com.example.pi22.reservation.entities.Reservation;

import java.util.List;

public interface IReservationService {
    void addReservation(Reservation r);
    void updateReservation(Reservation r);
    Reservation getReservation(Long id);
    void deleteReservation(Reservation r);
    void deleteReservationById(Long id);
    List<Reservation> getAllReservations();
    Reservation createResv(Reservation r);

    void annulerReservation(Reservation r);
}
