package com.example.pi22.publicite.entities;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.partner.entities.Partner;
import com.example.pi22.plan.entite.Plan;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Publicite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String catégorie;
    private Boolean enabled;
    private String picture;
    private String ciblage;
    private String title;
    private String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateCreation;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateDebut;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateFin;
    private float dureeAffichage;


    @ManyToOne
    @JoinColumn(name="id", nullable=true)
    private Partner partner;

    @ManyToOne
    @JoinColumn(name="id", nullable=true)
    private Offer offer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCiblage() {
        return ciblage;
    }

    public void setCiblage(String ciblage) {
        this.ciblage = ciblage;
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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

    public float getDureeAffichage() {
        return dureeAffichage;
    }

    public void setDureeAffichage(float dureeAffichage) {
        this.dureeAffichage = dureeAffichage;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    public Publicite(String nom, String catégorie, Boolean enabled, String picture, String ciblage, String title, String description, Date dateCreation, Date dateDebut, Date dateFin, float dureeAffichage, Partner partner, Offer offer) {
        super();
        this.nom = nom;
        this.catégorie = catégorie;
        this.enabled = enabled;
        this.picture = picture;
        this.ciblage = ciblage;
        this.title = title;
        this.description = description;
        this.dateCreation = dateCreation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.dureeAffichage = dureeAffichage;
        this.partner = partner;
        this.offer = offer;
    }
    public Publicite()  {
        super();
    }
}
