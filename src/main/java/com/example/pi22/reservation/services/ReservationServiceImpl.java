package com.example.pi22.reservation.services;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.offer.repo.OfferRepository;
import com.example.pi22.reservation.entities.Reservation;
import com.example.pi22.reservation.repo.ReservationRepository;
import com.example.pi22.user.User;
import com.example.pi22.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ReservationServiceImpl implements IReservationService {
    @Autowired
    ReservationRepository reservationRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OfferRepository offerRepository;

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

    @Override
    public void createResv(User u,  Set<Offer> off) {
        float lastprice = 0;
        Reservation r1 = new Reservation();
        LocalDate localDate = LocalDate.now();
        r1.setDateCreation(localDate);
        r1.setUser(u);
        Set<Offer> of = new HashSet<>() ;
        for (Offer f:off) {
            lastprice +=  f.getPrice();
            of.add(f);
            f.setStock(f.getStock()-1);
            offerRepository.save(f);
        }
        r1.setOffers(of);
         r1.setTotalPrice(lastprice);
         r1.setStatus("0");
         r1.setUser(u);
        reservationRepository.save(r1);
    }

}