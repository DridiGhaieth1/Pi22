package com.example.pi22.repositories;

import com.example.pi22.entities.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris ,Long> {
   /* @Query("SELECT Name as nameFavoris FROM Favoris f " +
            "INNER JOIN Activite a on f.id_Fav=a.id" +
            " INNER JOIN Abonnement ab on ab.id.activiteId = a.id " +
            "INNER JOIN User u on u.id = ab.id.userId  WHERE u.id=:idUserParam")

    public List<String> getFavorisName (@Param("idUserParam")Long id);*/
}
