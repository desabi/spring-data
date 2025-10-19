package com.desabi.guide.crud.h2.ega.service;

import com.desabi.guide.crud.h2.ega.entity.PersonEntity;
import com.desabi.guide.crud.h2.ega.model.request.PersonRequest;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface PersonService {
  ResponseEntity<HttpStatus> create(PersonRequest personRequest);
  ResponseEntity<List<PersonEntity>> read();
  ResponseEntity<PersonEntity> read(Long id);
  ResponseEntity<HttpStatus> update(Long id, PersonRequest personRequest);
}
