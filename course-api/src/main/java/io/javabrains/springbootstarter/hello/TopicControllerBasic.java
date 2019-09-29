package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RestController;

/*
    The generated json has key names corresponding to the fields in the Topic class. The Json values are the values of those properties.
   
    [{"id":"spring","name":"Spring framework","description":"Spring Framework Description"},
     {"id":"java","name":"Core Java","description":"Core Java Description"},
     {"id":"javascript","name":"Javascript","description":"Javascript Description"}]
*/

@RestController
public class TopicControllerBasic {
	
	/*@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
					new Topic("spring", "Spring framework", "Spring Framework Description"),
					new Topic("java", "Core Java", "Core Java Description"),
					new Topic("javascript", "Javascript", "Javascript Description")
				);
	}*/
}
