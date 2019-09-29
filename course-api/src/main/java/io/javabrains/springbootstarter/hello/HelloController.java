package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
   	A controller is a simple java class that maps a URI to an http method containing some functionality. Its basically is a Java class marked with
    @RestController & @RequestMapping annotations that that lets Spring know 
      1. What url access will trigger it
      2. Which method to run when accessed
      
    Also the method doesn't need to convert the value its returning to JSON/response object. This conversion happens automatically and is handled
    by the Spring MVC.
      
    Note: This concept is a part of spring mvc - a framework under the Spring umbrella which handles the View tier. Also we dont need to explicitly
    plug-in this class into the Spring framework as it already lies on the classpath and the classpath scan will register it. The Spring MVC has 
    all the controllers methods mapped to URI and http methods registered with it and ready to be invoked when a request arrives.
 */

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi";
	}
}
