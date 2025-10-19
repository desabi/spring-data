package com.desabi.guide.crud.h2.ega.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.MappedSuperclass;
import java.util.List;
import lombok.Data;

@Data
@MappedSuperclass // h2, JPA Hibernate
public class Person {
  protected String name;
  protected Double height;
  @ElementCollection // h2, JPA Hibernate
  protected List<String> hobbies;
}
