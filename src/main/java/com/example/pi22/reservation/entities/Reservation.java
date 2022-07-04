package com.example.pi22.reservation.entities;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.plan.entite.Plan;
import com.example.pi22.publicite.entities.Publicite;
import com.example.pi22.user.User;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private boolean validated;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;
    @ManyToMany
    Set<Offer> offers;
    @ManyToOne
    @JoinColumn(name="id", nullable=true)
    private User user;
    private float totalPrice;
    private String status;

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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
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

    public Reservation(boolean validated, Date dateCreation, Set<Offer> offers, float totalPrice) {
        super();
        this.validated = validated;
        this.dateCreation = dateCreation;
        this.offers = offers;
        this.totalPrice = totalPrice;
    }
    public Reservation (){
        super(); }

}
