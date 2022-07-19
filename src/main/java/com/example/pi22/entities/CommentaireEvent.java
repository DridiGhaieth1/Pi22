package com.example.pi22.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data

public class CommentaireEvent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    @Temporal(TemporalType.DATE)
    private Date DateDebut ;
    private String description;

    @ManyToOne
    private User userCmnt;

    @ManyToOne
    private Evenement eventCmnt;


}
