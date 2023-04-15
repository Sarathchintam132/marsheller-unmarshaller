package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestApiJaxbApplication {

	public static void main(String[] args) throws Exception {
		
		
		ConfigurableApplicationContext run = SpringApplication.run(RestApiJaxbApplication.class, args);
		
		Marshalling bean = run.getBean(Marshalling.class);
		
		bean.marshallingMethod();
		bean.unMarshallingMethod();
	}

}
