package com.example.pi22.offer.entities;

import com.example.pi22.partner.entities.Partner;
import com.example.pi22.publicite.entities.Publicite;
import com.example.pi22.reservation.entities.Reservation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private float price;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateDebut;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateFin;
    private int stock;
    private boolean enabled;
    private String picture;
    private String title;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy="offer")
    private Set<Publicite> publicites;
    @JsonIgnore
    @ManyToMany(mappedBy="offers")
    Set<Reservation> reservations;
    @ManyToOne
    private Partner partner;

    public Offer(String type, float price, Date dateCreation, int stock, boolean enabled, String picture, String title, String description, Partner partner) {
      super();
        this.type = type;
        this.price = price;
        this.dateCreation = dateCreation;
        this.stock = stock;
        this.enabled = enabled;
        this.picture = picture;
        this.title = title;
        this.description = description;
        this.partner = partner;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Offer(){
        super();
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Set<Publicite> getPublicites() {
        return publicites;
    }

    public void setPublicites(Set<Publicite> publicites) {
        this.publicites = publicites;
    }

    public Set<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
}
