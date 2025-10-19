package com.desabi.guide.crud.h2.ega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class.
 * To solve the error in the h2 console. It is necessary to create the test.mv.db file in the user
 * root folder.
 * <a href=
 * "https://stackoverflow.com/questions/61865206/springboot-2-3-0-while-connecting-to-h2-database">
 * source</a>
 */
@SpringBootApplication
public class CrudH2EgaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudH2EgaApplication.class, args);
	}

}
