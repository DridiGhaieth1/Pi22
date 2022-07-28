package com.example.pi22.partner.entities;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.plan.entite.Plan;
import com.example.pi22.publicite.entities.Publicite;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String adress;
    private String fiscale;
    private String tel;
    private String categorie;
    private String nom;
    private String activites;
    @JsonIgnore
    @OneToMany(mappedBy="partner")
    private Set<Offer> offers;
// cascade all
    @ManyToOne
    private Plan plan;
    @JsonIgnore
    @OneToMany(mappedBy="partner")
    private Set<Publicite> publicites;

    public Partner(Integer id, String adress, String fiscale, String tel, String categorie, String activites) {
       super();
        this.id = id;
        this.adress = adress;
        this.fiscale = fiscale;
        this.tel = tel;
        this.categorie = categorie;
        this.activites = activites;
    }
    public Partner(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFiscale() {
        return fiscale;
    }

    public void setFiscale(String fiscale) {
        this.fiscale = fiscale;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getActivites() {
        return activites;
    }

    public void setActivites(String activites) {
        this.activites = activites;
    }

    public Set<Offer> getOffers() {
        return offers;
    }

    public void setOffers(Set<Offer> offers) {
        this.offers = offers;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Set<Publicite> getPublicites() {
        return publicites;
    }

    public void setPublicites(Set<Publicite> publicites) {
        this.publicites = publicites;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
