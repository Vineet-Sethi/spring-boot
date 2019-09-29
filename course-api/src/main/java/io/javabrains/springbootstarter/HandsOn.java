/*
	Maven: Typically in a java application we add jars to our classpath and then those classes and methods of the jar are available to our application.
	Maven is a dependency management system that lets you manage application dependencies by letting you declare the dependencies in a pom.xml file. 
	Hence you don't need to download the jars and add it to your classpath. Maven just needs to know the jars that you'll need and it will download then
	from a Maven repository. Maven also lets you create a starter project so that we dont need to create the individual files. Hence we can create a Maven
	project which is a template project and it will contain a pom.xml and we can list our dependencies in it.
    
    In STS select: New ---> Maven Project ---> (skip archtype selection) if not checked will ask you to choose from a few template projects that come 
    with Maven. If you select it you will get a bare bones maven project.
    
    		Group Id: package name that uniquely identifies the namespace for your project  //io.javabrains.springbootquickstart
    		Artifact Id: Is the name of the project itself.                                 //course-api
      
    This would create a maven project with all the required folders and you can see the details you entered while creating the project in the pom.xml
    This is still a maven project and to convert this project to "spring project" you need to add the following
    
    		<parent>
			  	<groupId>org.springframework.boot</groupId>
			  	<artifactId>spring-boot-starter-parent</artifactId>
			  	<version>1.5.9.RELEASE</version>
  			</parent>
  			
  	The parent tag defines that our maven project is a child of the project defined under the parent node. The paret child terminology is a very 
  	Maven concept and it lets the child project in our case the maven project inherit configuration from the parent spring project. Spring favors
  	convention over configuration and the spring-boot-starter-project contains default ready-to-use out of the box configuration.  
  	
  	Our application is going to be a web application employing Rest API calls. In a typical maven project we would be adding all the jars related
  	to a web project. This list is quite a big one and here spring boot helps us by letting us define those dependencies via its web starter project
  	Spring has predefined jars that we would need for any web project and we can add the following dependency node to our pom.xml to get those jars
  	  	
  			<dependencies>
			  	<dependency>
			  		<groupId>org.springframework.boot</groupId>
			  		<artifactId>spring-boot-starter-web</artifactId>  // This is like a meta-dependency that will pull all the web related jars
			  	</dependency>                                         // so that you dont have to add them one by one.
  			</dependencies>
  			
  	Saving pom.xml will trigger maven to download all the dependencies immediately and you will notice a Maven Dependencies library node in the 
  	project. After this you might need to update your project configuration with pom.xml. This would also update the JRE System library node to 1.6
  	However you can change this to use Java 1.8 by adding the java dependency.
  	
  			<properties>
		  		<java.version>1.8</java.version>
		    </properties>
		    
    Note: The <parent> node only downloads the configuration and not the actual jars!! It is the dependencies section which tells Maven what jars
    to download. Remove this and you wont see any dependencies getting downloaded. The <artifactId>spring-boot-starter-web</artifactId> is a meta 
    dependency & leads to the combination of jars that work well together with the specified spring version. The version of these jars are governed
    by the <version>1.5.9.RELEASE</version> node in the parent. For eg setting this version to 1.0.0 will download a tomcat version 7.0.52 & spring
    -beans-4.0.3. As such we dont need to choose the individual jars. Thus 1.5.9 specifies the bunch of dependencies which work well together but 
    they get downloaded when dependencies are specified. 
    
    The preset list of the combination of jars that work well together is called as bill of materials.
    
    Spring comes with an embedded tomcat server that means you dont have to download it configure it and then deploy your app. This was done cuz:
    1. Convenience
    2. Servlet config is application config
    3. Standalone
    
 */
  