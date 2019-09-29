/*
	We need to tell JPA the resource that we want to save in the DB in our case the Topic instances. So we mark the Topic class with @Entity
	annotation. We also mark the id field with @Id to make it as the primary key in the table. With these 2 annotations the JPA will create
	a Topic table in the DB with field names corresponding to column names and the Id column as the primary key. We can now save instances of
	Topics as rows in the DB or fetch records from the Topic table as a list of Topic instances. 
	
	With the above mechanism the basic ORM is in place however the Spring JPA also has basic CRUD operations implemented for entity objects
	out of the box. For this JPA provides a CrudRepository interface through which you will have the basic CRUD operations available for your
	entity. As the CrudRepository is generic you also need to pass the entity type and the id(primary key) to it. To use this you create an 
	interface and extend it with the CrudRepository and the type info you just passed. Next you autowire this interface as a dependency in
	your TopicService class. Now you can use the methods of the CrudRepository in your service.
*/