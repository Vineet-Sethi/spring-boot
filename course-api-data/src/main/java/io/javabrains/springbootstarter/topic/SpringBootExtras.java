/*
	Deployment
	----------
	
	You can get a jar out of your sprong boot application using maven. To do this go to the root of your application and run
		mvn clean install
		
	This command will clean the target directory, download any dependencies your application needs, run all your unit tests and create a jar.
	And since the goal of Spring Boot is to create a standalone application you dont need to download a servlet conatainer and configure it.
	The packaged jar already has a bundled tomcat with related configuration. Hence all you need to run a Spring Boot application is a Java
	runtime.
	
	The jar is created in the target directory. To execute the jar you run
		java -jar target/<jarFileName>.jar
		
	You can also create a war file in case you want to deploy your application to an existing servlet container. To do this you need to change
	the <packaging>jar</packaging> in pom.xml to war.
	
	Actuator
	--------
	
	The actuator feature allows you to monitor your Spring boot application after you have deployed it. You include the actuator in your boot
	project by adding the following dependency
	 	<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		
	This will add a new rest point in your application. For eg you can access
		http://localhost:8080/health  - a controller that we didn't wrote
		
	and get a list of metrics like diskspace, db running status etc.  By default the actuator controller are accessible at the same url as our
	application localhost:8080. However this can be changed by adding the property
		management.port = 9001
		
	This would help when you are granting different users different access to your application. 
	
		http://localhost:8080/beans 
		
		Gives you all the beans your application is using and their dependencies. This is quite useful when you are understanding a new spring 
		boot application.
*/