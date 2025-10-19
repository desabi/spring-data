package com.desabi.guide.crud.h2.ega.repository;

import com.desabi.guide.crud.h2.ega.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
