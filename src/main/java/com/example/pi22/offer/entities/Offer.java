package com.example.pi22.offer.entities;

import com.example.pi22.partner.entities.Partner;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private float price;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;
    private int stock;
    private boolean enabled;
    private String picture;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name="id", nullable=true)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
