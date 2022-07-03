package com.example.pi22.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Departements implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String nomDepart;
}
