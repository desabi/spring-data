package com.desabi.guide.crud.h2.ega.service;

import com.desabi.guide.crud.h2.ega.model.request.PersonRequest;
import com.desabi.guide.crud.h2.ega.repository.PersonRepository;
import com.desabi.guide.crud.h2.ega.entity.PersonEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  public PersonServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public ResponseEntity<HttpStatus> create(PersonRequest personRequest) {
    try {
      PersonEntity personEntity = new PersonEntity(personRequest);
      personRepository.save(personEntity);
      return new ResponseEntity<>(HttpStatus.CREATED);
    } catch (Exception exception) {
      log.error("Exception creating person: {}", exception.getMessage());
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
