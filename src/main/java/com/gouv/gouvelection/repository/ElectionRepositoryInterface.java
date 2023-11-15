package com.gouv.gouvelection.repository;

import java.util.Date;
import java.util.List;

import com.gouv.gouvelection.entity.Election;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "election", path = "election")
public interface ElectionRepositoryInterface extends CrudRepository<Election, Long> {

    @Query("select e from Election e where e.startDate >= :startDate")
    List<Election> findAllAfterCurrentDate(@Param("startDate") Date startDate);

    Election findByName(@Param("name") String name);
}
