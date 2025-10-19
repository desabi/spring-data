package com.desabi.guide.crud.h2.ega.controller;

import com.desabi.guide.crud.h2.ega.entity.PersonEntity;
import com.desabi.guide.crud.h2.ega.model.request.PersonRequest;
import com.desabi.guide.crud.h2.ega.response.ResponseIndex;
import com.desabi.guide.crud.h2.ega.service.PersonService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping("/index")
  public ResponseEntity<ResponseIndex> index() {
    String message = "CRUD with H2, Example A";
    return new ResponseEntity<>(new ResponseIndex(message), HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<HttpStatus> create(@RequestBody PersonRequest personRequest) {
    return personService.create(personRequest);
  }

  @GetMapping
  public ResponseEntity<List<PersonEntity>> read() {
    return personService.read();
  }

  @GetMapping("/{id}")
  public ResponseEntity<PersonEntity> read(@PathVariable("id") Long id) {
    return personService.read(id);
  }

}
