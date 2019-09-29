/*
   Spring
   
   Most enterprise applications do a lot of similar things no matter what business problem they are trying to solve. For example most applications 
   would need to connect to a DB, run queries, make HTTP requests etc. Now if all applications write code for these concerns it seems like an overdo
   and it would be nice to have someone or something that takes care of these concerns so that developers can concentrate on the business logic while
   the common concerns are taken care of almost by themselves. This is the sole reason for the introduction of Spring. Spring lets you build enterprise
   java applications by addressing the common concerns of enterprise applications. It provides a template or a framework to build those applications. 
    
   Spring started off trying to solve common concerns that enterprise applications could have. However these common concerns were not a single thing. 
   Also there could be n number of ways to build an enterprise applications & Spring tried to address all of these and as such it actually grew over 
   the years to become a huge framework. It started as something that implements dependency injection but over the years it has grown to do a lot of 
   things. There are so many things that spring does so that it has become overwhelming as to how to even get started with a spring application. This 
   resulted in multiple setup steps and configuration steps. For eg Spring can connect to a Mongo DB, an RDBMS and it can connect to even JDO which is
   outdated but it has support in Spring framework. Hence you need to tell spring what exactly you want it to do and hence multilple setup & configuration
   steps. Finally we have multiple build and deploy steps. You need to know how to build and deploy and again there are multiple combinations that you
   need to know.
   
   The key point here is that since there are so many ways to start an enterprise application there is no standard starting point. There is no 
   guide that tells that this is the best practice or this is how one should ideally do it. Its upto us to figure out the way to start building the
   application. The second point is that even having figured out the way as to how to start you will still need tell spring what exactly you want and
   hence the multiple setup, configuration, build & deploy steps. 
   
    How Spring Works?
    With Spring you basically concentrate on your business logic and let spring handle the common concerns. You write your application classes which are 
    simple POJOs and then annotate them to tell spring what they are. So for eg if you are writing a business service, you write the business logic specific
    to that service and then you annotate the class with @service annotation. This tells spring that you intend to use the class as a service. This lets 
    Spring to do a apply whole lot of things to that class like for eg manage its lifecycle so that it acts as a service. So as a developer you only focus
    on the business logic and let spring do the rest.
    Spring also provides infrastructure support like if you want to connect to an RDBMS DB or a Derby/Mongo DB Spring provides the necessary support.
   
   Spring Boot
   
   The enormity of Spring is why Spring Boot came up. SB tries to abstract these infrastructure, setup and configuration concerns. Granted that there
   are hundred different ways to build a spring application, Spring boot tries to tell us that this is the right way to do it in 80% of the cases and
   for the 20% you can configure it and tweak it so that it works differently. So it basically tries to address the majority use case, gives us an
   opinionated configuration. It helps us give a starting point and we can tweak it later if required. Hence SB is opinionated in the sense that it 
   makes some configuration choices on behalf of us by favoring convention over configuration(majority use case)
   
   In essence spring boot provides a way in which you can bootstrap or quickly startup a Spring Application from scratch. Without SB a simple spring 
   application would require a lot of configuration steps(configuring, placing jars etc) to get to a point where you could simply run the app. Spring
   boot addresses these issues and you can bootstrap an application pretty quickly. Hence 
   	
   	Spring boot makes it easy to create stand-alone(packaged with servlet container), production grade Spring based applications that you can just run.
*/
