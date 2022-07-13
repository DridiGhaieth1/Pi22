package com.example.pi22.reservation.services;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.offer.repo.OfferRepository;
import com.example.pi22.offer.services.IOfferService;
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

    @Autowired
    IOfferService offerService;


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
    public Reservation createResv(Reservation r) {
        float lastprice = 0;
        LocalDate localDate = LocalDate.now();
        r.setDateCreation(localDate);
        for (Offer f:r.getOffers()) {
          Offer off1 =  offerService.getOffer(f.getId());
            lastprice +=  off1.getPrice();

         // System.out.println(off1.getPrice());

        }
         r.setTotalPrice(lastprice);
         r.setStatus("1");

        return reservationRepository.save(r);
    }

    @Override
    public void annulerReservation(Reservation r) {
        for (Offer f:r.getOffers()) {
            // of.add(f);
            f.setStock(f.getStock()+1);
            offerRepository.save(f);
        }
        r.setStatus("0");
        //    r1.setUser(u);
        reservationRepository.save(r);
    }


}
