package com.prowings.main;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;

import com.prowings.model.dto.Employee;
import com.prowings.model.source.Person;

public class TestDozerBeanMapper {
	
	public static void main(String[] args) {
		
		Person person = new Person("Ram", 31, "Pune", 5.5d);
		
		
//		Employee employee = new DozerBeanMapper().map(person, Employee.class);
		
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		Employee employee = mapper.map(person, Employee.class);

		System.out.println(employee);
		
	}

}
