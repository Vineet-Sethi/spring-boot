package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

/*
	Rest API
	    To create a REST API you must identify the resources in your application. The resources are the Things(Nouns) within your application.
		  You can then figure out ways for consumers to access these resources.
	  
	  For getting a specific topic from the list of topics we need to pass a variable in the URI something like a request parameter. And 
	  depending on that variable a particular topic will be fetched. So passing "/topics/java" in the url isn't good as we are hardcoding our
	  URL and we need to parameterize it.
	  
			@RequestMapping("/topics/java")
			public Topic getTopic(String id) {
				return topicService.getTopic(id);
			}
		
		We create a request parameter variable by passing its name in {}. Now foo here is the variable. We now need to pass it to our method as an
		argument so that our method can use it to search a topic in the list. For this we need to map the request parameter to our function argument. 
					
		This is achieved by adding the annotation @PathVariable("foo") to the left of the argument we intend to map to and passing it the same request
		parameter variable.
			@RequestMapping("/topics/{foo}")
			public Topic getTopic(@PathVariable("foo") String id) {
				return topicService.getTopic(id);
			}

	 Also this can work automatically if the request parameter variable name matches the function argument and then we dont need to pass it to the
	 @PathVariable annotation.  
*/

/*
	The @RequestMapping("/topics") annotation maps all GET requests on "/topics" to the getAllTopics method. We now want to map POST requests on 
	"/topics" to another method. The POST call will add a topic object to the TopicService list.
	
	To do this you first need to use the below annotation that is an expanded way of requestmapping. This tells the request method and url both as
	compared to the previous one which is a shortcut.
		 @RequestMapping(method = RequestMethod.POST, value="/topics")
	 	   
	Next the POST body will contain a Topic json that you need to extract and pass it as a parameter to your method. This is similar to using the
	@RequestMapping("/topics/{id}") and @PathVariable annotations to tell that it is the PathVariable part of the request payload that needs to be 
	extracted and passed on as a parameter. In the POST case we need to extract the RequestBody from the request payload. The @RequestBody annotation 
	tells SpringMVC that the request payload contains a JSON representation of the Topic and it will convert that JSON into a Topic instance. We also
	need to pass the Content-Type header as application/json to let the API know that the payload we are passing is a JSON and not a regular string or
	xml or text/plain.
*/

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
		
	@RequestMapping(method = RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)    
	{                                                 
		topicService.addTopic(topic);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) 
	{
		topicService.updateTopic(id, topic);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) 
	{
		topicService.deleteTopic(id);
	}
}
