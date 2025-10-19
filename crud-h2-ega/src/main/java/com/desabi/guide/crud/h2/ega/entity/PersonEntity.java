package com.desabi.guide.crud.h2.ega.entity;

import com.desabi.guide.crud.h2.ega.model.Person;
import com.desabi.guide.crud.h2.ega.model.request.PersonRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class PersonEntity extends Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  // create
  public PersonEntity(PersonRequest personRequest) {
    this.name = personRequest.getName();
    this.height = personRequest.getHeight();
    this.hobbies = personRequest.getHobbies();
  }
}
