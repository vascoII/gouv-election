package com.gouv.gouvelection.repository;

import com.gouv.gouvelection.entity.Scrutin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "scrutin", path = "scrutin")
public interface ScrutinRepositoryInterface extends CrudRepository<Scrutin, Long> {

}
