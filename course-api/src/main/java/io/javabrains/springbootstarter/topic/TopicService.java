package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/*
  Business Service
  	In Spring services or Business Services are singletons. When Spring starts up it scans the classpath and looks for all the services instantiates
 	them and registers them in its memory. Now different controllers or services in your spring application can have this service injected and 
 	available to them. This all is again carried via annotations (@Service, @Autowired). You create a java class and annotate it with @Service which
 	is a stereotype annotation. This class will now be instantiated as a singleton on startup. To inject this instance into another controller/service
 	you declare a private member variable of this service and annotate it with @Autowired. And now when you write methods in your controller/service
 	you can be rest assured that the service instance is available for you. And you call methods to return objects/data from your service.
*/ 

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "Spring Frameowrk", "Spring Boot Tutorial"),
			new Topic("java", "Core Java", "Core Java tutorial"),
			new Topic("javascript", "Javascript", "Javascript Tutorial")));
	
	public List<Topic> getAllTopics()
	{
		return topics;
 	}
	
	public Topic getTopic(String id)
	{
		Topic reqTopic = null;
		for(Topic topic: topics)
		{
			if(topic.getId().equals(id))
				reqTopic = topic;
		}
		return reqTopic;
 	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i = 0; i < topics.size(); i++)
		{
			if(topics.get(i).getId().equals(id))
				topics.set(i, topic);
		}
	}

	public void deleteTopic(String id) {
		
		Topic reqTopic = null;
		for(Topic topic: topics)
		{
			if(topic.getId().equals(id))
				reqTopic = topic;
		}
		
		topics.remove(reqTopic);
	}
}
