package com.desabisc.guide.db.postgresql;

import com.desabisc.guide.db.postgresql.entity.Person;
import com.desabisc.guide.db.postgresql.repository.PersonRepository;
import java.time.LocalDate;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Slf4j
public class PostgresqlDemoAApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlDemoAApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository personRepository) {
		return args -> {
			//savePerson(personRepository);
			readPersons(personRepository);
		};
	}

	static void savePerson(PersonRepository personRepository) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();

		person1.setName("ana");
		person1.setAge(25);
		person1.setWeight(45.19);
		person1.setGender('F');
		person1.setMarried(true);
		person1.setBirthDate(LocalDate.now());
		person1.setHobbies(List.of("hiking", "painting"));

		person2.setName("bob");
		person2.setAge(70);
		person2.setWeight(90.36);
		person2.setGender('M');
		person2.setMarried(true);
		person2.setBirthDate(LocalDate.now());
		person2.setHobbies(List.of("reading", "swimming"));

		person3.setName("charly");
		person3.setAge(43);
		person3.setWeight(52.87);
		person3.setGender('M');
		person3.setMarried(false);
		person3.setBirthDate(LocalDate.now());
		person3.setHobbies(List.of("painting", "gardening"));

		personRepository.save(person1);
		personRepository.save(person2);
		personRepository.save(person3);
	}

	//@Transactional
	static void readPersons(PersonRepository personRepository) {
		List<Person> all = personRepository.findAll();
		log.info("{}", all);
	}
}
