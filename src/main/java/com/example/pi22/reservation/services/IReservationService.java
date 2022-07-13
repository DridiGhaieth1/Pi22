package com.example.pi22.reservation.services;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.reservation.entities.Reservation;
import com.example.pi22.user.User;

import java.util.List;
import java.util.Set;

public interface IReservationService {
    void addReservation(Reservation r);
    void updateReservation(Reservation r);
    Reservation getReservation(Long id);
    void deleteReservation(Reservation r);
    void deleteReservationById(Long id);
    List<Reservation> getAllReservations();
    void createResv(Reservation r);
}
