package com.desabisc.guide.db.postgresql.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  private int age;

  private double weight;

  private char gender;

  private boolean married;

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @ElementCollection(fetch = FetchType.EAGER) // Force immediate loading
  @CollectionTable(name = "person_hobbies", joinColumns = @JoinColumn(name = "person_id"))
  @Column(name = "hobby")
  private List<String> hobbies;
}
