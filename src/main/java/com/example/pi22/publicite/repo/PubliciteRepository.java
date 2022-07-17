package com.example.pi22.publicite.repo;

import com.example.pi22.publicite.entities.Publicite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PubliciteRepository extends CrudRepository<Publicite, Integer> {
}
