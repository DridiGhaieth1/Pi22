package com.example.pi22.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class AbonnementId implements Serializable {

@Column(name = "user_id")
private Long userId;

@Column(name = "activite_id")
private Long activiteId;


}
