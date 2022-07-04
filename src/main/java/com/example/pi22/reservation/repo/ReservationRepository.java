package com.example.pi22.reservation.repo;

import com.example.pi22.reservation.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository  extends CrudRepository<Reservation, Integer> {
}
