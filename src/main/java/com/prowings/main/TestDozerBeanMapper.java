package com.prowings.main;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.prowings.model.dto.Candidate;
import com.prowings.model.dto.Employee;
import com.prowings.model.source.Address;
import com.prowings.model.source.Person;
import com.prowings.model.source.Student;

public class TestDozerBeanMapper {
	
	public static void main(String[] args) {
		
		Person person = new Person("Ram", 31, "Pune", "5.5", 4, 954547200);
		
		
//		Employee employee = new DozerBeanMapper().map(person, Employee.class);
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		
		Employee employee = mapper.map(person, Employee.class);

		System.out.println(employee);
		
		Address address = new Address(123, "Pune", "India");
		Student student = new Student(10, "Ram", Arrays.asList(address));
		
		Candidate candidate = mapper.map(student, Candidate.class);
		
		System.out.println(candidate);
		
	}

}
