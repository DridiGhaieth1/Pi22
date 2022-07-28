package com.example.pi22.reservation.entities;
import com.example.pi22.offer.entities.Offer;
import com.example.pi22.user.User;
import com.fasterxml.jackson.annotation.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
public class Reservation  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean validated;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateCreation;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    Set<Offer> offers;
    @JsonIgnoreProperties(value = {"reservations", "handler","hibernateLazyInitializer"}, allowSetters = true)
    @ManyToOne(fetch=FetchType.LAZY)
    private User user;
    private float totalPrice;
    private String status;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Set<Offer> getOffers() {
        return offers;
    }

    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reservation(boolean validated, LocalDate dateCreation, Set<Offer> offers, float totalPrice) {
        super();
        this.validated = validated;
        this.dateCreation = dateCreation;
        this.offers = offers;
        this.totalPrice = totalPrice;
    }

    public Reservation (){
        super(); }

}
