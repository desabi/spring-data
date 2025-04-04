package com.desabisc.guide.db.postgresql.repository;

import com.desabisc.guide.db.postgresql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
