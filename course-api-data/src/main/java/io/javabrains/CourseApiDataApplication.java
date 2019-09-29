package io.javabrains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
	In a typical java application we use JDBC to connect to a DB, run queries on it and get ResultSets. These query results need to be converted to objects 
	as a java application contains classes and objects. Also we need to set up a DB and create tables in it before we can do all this. ORM or Object 
	Relational Mapping automates all this. With ORM we provide some meta data on our entity classes which maps the classes to SQL tables. And then we dont
	have to query and convert results to objects yourself which is quite handy. The Java Persistence API is basically a specification that lets you do
	the ORM stuff.
	
	Spring Data JPA - It is a separate project which makes working with ORM tools even easier. It does a lot more than just object to table mapping and has
	in a generic way implemented the basic CRUD operations for the entity classes that we might have. These come as ready to use out of the box with the
	Spring Data JPA.
	
	Create a new Spring Starter Project and select Web with Derby & JPA(brings in Spring data JPA) in SQL section. The Derby jars are downloaded
	and when the application is started the DB is up and running in the classpath which is good during development as a test database.
*/

@SpringBootApplication
public class CourseApiDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiDataApplication.class, args);
	}
}
