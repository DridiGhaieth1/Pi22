package com.example.pi22.plan.entite;

import com.example.pi22.offer.entities.Offer;
import com.example.pi22.partner.entities.Partner;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String type;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date DateDebut;
    private int durre;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date DateInscri;
    private Boolean renouvlable;

    @OneToMany(mappedBy="plan")
    private Set<Partner> partners;

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

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public int getDurre() {
        return durre;
    }

    public void setDurre(int durre) {
        this.durre = durre;
    }

    public Date getDateInscri() {
        return DateInscri;
    }

    public void setDateInscri(Date dateInscri) {
        DateInscri = dateInscri;
    }

    public Boolean getRenouvlable() {
        return renouvlable;
    }

    public void setRenouvlable(Boolean renouvlable) {
        this.renouvlable = renouvlable;
    }

    public Plan(String type, Date dateDebut, int durre, Date dateInscri, Boolean renouvlable, Set<Partner> partners) {
        this.type = type;
        DateDebut = dateDebut;
        this.durre = durre;
        DateInscri = dateInscri;
        this.renouvlable = renouvlable;
        this.partners = partners;
    }

    public Plan(){
        super();
    }

    public Set<Partner> getPartners() {
        return partners;
    }

    public void setPartners(Set<Partner> partners) {
        this.partners = partners;
    }
}
