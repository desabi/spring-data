package com.desabi.guide.crud.h2.ega.repository;

import com.desabi.guide.crud.h2.ega.entity.PersonEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
}
