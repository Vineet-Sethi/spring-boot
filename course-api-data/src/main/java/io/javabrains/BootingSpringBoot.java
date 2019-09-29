/*
	1. Maven Project: Create a simple maven project and add the dependencies manually in pom.xml.
	   
	2. Spring Initialzr: Lets you bootstrap your spring boot application by choosing your options and downloading it from the spring initializr portal.
	   You provide your app's Group, Artifact, Name, Description, Package Name etc at the portal. You can then choose/search the dependencies for your
	   project. Once done you would click the Generate Project Button which downloads a zip file for your project. You can then import it in your STS.
	    
	3. Spring Tool Suite: Package Explorer(Right click) -> New -> Spring Starter Project. This is very similar to the spring initializr way and here you
	   provide the maven coordinates and the dependencies via the STS IDE. In the backend it still uses the initializr portal to download the project 
	   zip file and it gets imported then.    
	  
	4. Spring Boot CLI: Its a command line tool that lets u quickly develop prototype with Spring application. It is not something which you would use
	   to deploy and manage a live application but its a good tool to quickly start prototyping. It lets you run Groovy scripts, which means that you
	   dont have so much boilerplate code. 
	   Manual Installation: Download zip and extract. Few package managers are also there for automatic installation.
    
	Configuring Spring Application: Sometimes you may need to configure your spring boot app to change the default working way of Spring boot. 
	One typical and easiest way to customize is by using an application.properties file which is basically how you can configure any spring application
	and not just spring boot one. This file contains a list of key value pairs and is usually kept in the resources folder.
	
		 For eg server.port=8081 changes the port to 8081.
*/