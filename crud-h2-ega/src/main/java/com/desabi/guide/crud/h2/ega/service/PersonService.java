package com.desabi.guide.crud.h2.ega.service;

import com.desabi.guide.crud.h2.ega.model.request.PersonRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public interface PersonService {
  ResponseEntity<HttpStatus> create(PersonRequest personRequest);
}
