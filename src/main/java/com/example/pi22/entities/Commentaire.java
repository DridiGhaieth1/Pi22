package com.example.pi22.entities;

import com.example.pi22.user.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire;
    private String texteCommentaire;

    @ManyToOne
    private Article article;
    @ManyToOne
    private User user;
}
