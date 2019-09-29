package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    In a typical web application we download a servlet container such as Tomcat, configure it and then deploy our application into the container. 
    
    Spring boot allows us to create an application that's stand-alone, which means that you dont need a servlet container to deploy your application.
    This works by having a main method in your application which will eventually start tomcat and deploy your app in it.
    
    You do this by telling spring that this is a Spring application by marking the main class with @SpringBootApplication. Next you write 
     	SpringApplication.run(CourseApiApp.class, args); 
     	
    This one line of code will start the tomcat and deploy your app to it. You can check the eclipse console and then go to localhost:8080 to verify.

   Sets up default configuration - as spring favors convention over configuration here it is loading that default or conventional configuration
   Starts Spring application context - Spring acts as a container for all your code(business sevices, controllers, data services etc) that
                                       runs on your application server. This container is nothing but the spring application context & every
                                       spring application has it.
   Performs class path scan - In a spring app as we write code we annotate classes with lets say @Service @Controller. By doing this we let 
                              spring manage the lifecycle and behavior of that class. But for this to happen Spring has to scan all classes
                              in your application classpath and then perform all the activities for these components.
   Starts Tomcat - With Spring we didn't have to download Tomcat configure it and deploy an app to it. This all happened automatically when
                   with the below line of code and as we run we could see Tomcat being started in console logs.
*/

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}
}
