package com.gouv.gouvelection.repository;

import java.util.List;

import com.gouv.gouvelection.entity.Elector;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "elector", path = "elector")
public interface ElectorRepositoryInterface extends PagingAndSortingRepository<Elector, Long>, CrudRepository<Elector,Long> {

    Elector findByNationalIdAndPassword(@Param("nationalId") String nationalId, @Param("password") String password);

}