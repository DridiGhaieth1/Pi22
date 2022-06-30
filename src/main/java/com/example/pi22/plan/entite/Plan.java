package com.example.pi22.plan.entite;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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

    public Plan(int id, String type, Date dateDebut, int durre, Date dateInscri, Boolean renouvlable) {
     super();
        this.id = id;
        this.type = type;
        DateDebut = dateDebut;
        this.durre = durre;
        DateInscri = dateInscri;
        this.renouvlable = renouvlable;
    }
    public Plan(){

        super();
    }
}
