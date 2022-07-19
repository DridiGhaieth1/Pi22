package com.example.pi22.entities;

import lombok.Data;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Invitation implements Serializable {

    @EmbeddedId
    private InvitationId idInv ;
    private String descptionInv ;
    @Temporal(TemporalType.DATE)
    private Date dateInvitation ;

    @ManyToOne
    @JoinColumn(name ="user_id",insertable = false,updatable = false)
    private User userInv ;

    @ManyToOne
    @JoinColumn(name="event_id",insertable = false,updatable = false)
    private Evenement evenement ;


}
