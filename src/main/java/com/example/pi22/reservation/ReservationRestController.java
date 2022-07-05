package com.example.pi22.reservation;

import com.example.pi22.reservation.entities.Reservation;
import com.example.pi22.reservation.services.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReservationRestController {
    @Autowired
    IReservationService reservationService;

    @PostMapping("/reservation/add")
    @ResponseBody
    public void ajouterReservation(@RequestBody Reservation f) {
        reservationService.addReservation(f);
    }

    @GetMapping("/reservation/list")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public List<Reservation> listeReservations() {
        return reservationService.getAllReservations();
    }

    @DeleteMapping(value = "/reservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservationById(id);
    }

    @PutMapping("/reservation/update")
    @ResponseBody
    public void updateReservation(@RequestBody Reservation f) {
        reservationService.updateReservation(f);
    }

}
