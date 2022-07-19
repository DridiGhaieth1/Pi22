package com.example.pi22.entities;

import lombok.Data;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data

public class Commentaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    @Temporal(TemporalType.DATE)
    private Date DateDebut ;
    private String description;

    @ManyToOne
    private User user_Cmnt;

    @ManyToOne
    private Evenement eventCmnt;


}
