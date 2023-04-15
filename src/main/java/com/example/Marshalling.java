package com.example;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Marshalling {

	//public static void main(String[] args) throws Exception {
	@Bean
	public void marshallingMethod() throws Exception {
		Address a = new Address("kadapa", "AP", "India");
		Student s = new Student(101, 02, "sarath", a);
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(s, System.out);
		marshaller.marshal(s, new File("student.xml"));
		System.out.println("marshalling completed");
	}
	
	@Bean
	public void unMarshallingMethod() throws Exception {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		Object object = unmarshaller.unmarshal(new File("student.xml"));
		Student stu =(Student)object;
		System.out.println(stu);
		System.out.println("=======================unmarshalling completed"
				+ "==============================================");
	}
		
	}

