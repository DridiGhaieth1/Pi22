package com.example.pi22.repositories;

import com.example.pi22.entities.TypeActivite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeActiviteRepository extends JpaRepository<TypeActivite,Long> {
 /* @Query( value = "SELECT Name as nameFavoris FROM Favoris f " +
            "INNER JOIN Activite a on f.id_Fav=a.id" +
            " INNER JOIN Abonnement ab on ab.id.activiteId = a.id " +
            "INNER JOIN User u on u.id = ab.id.userId  WHERE u.id=:idUserParam", nativeQuery = true)

    public List<String> getFavorisName1 (@Param("idUserParam")Long id);*/

    @Query("select t.name  from TypeActivite  t left join  t.activites a " +
            "inner join a.abonnement ab inner join ab.userAbn us where us.id=:idUser")
    public List<String> getTypeActiviteName (@Param("idUser")Long id);
}
