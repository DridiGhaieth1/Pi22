package com.example.pi22.partner.entities;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.plan.entite.Plan;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String adress;
    private String matriculeFiscale;
    private String tel;
    private String catégorie;
    private String activites;

    @OneToMany(mappedBy="partner")
    private Set<Offer> offers;

    @ManyToOne
    @JoinColumn(name="id", nullable=true)
    private Plan plan;


    public Partner(int id, String adress, String matriculeFiscale, String tel, String catégorie, String activites) {
       super();
        this.id = id;
        this.adress = adress;
        this.matriculeFiscale = matriculeFiscale;
        this.tel = tel;
        this.catégorie = catégorie;
        this.activites = activites;
    }
    public Partner(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMatriculeFiscale() {
        return matriculeFiscale;
    }

    public void setMatriculeFiscale(String matriculeFiscale) {
        this.matriculeFiscale = matriculeFiscale;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
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
}
