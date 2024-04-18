package com.prowings.main;

import org.dozer.CustomConverter;

public class ModeConverter2 implements CustomConverter{

	public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue, Class<?> destinationClass,
			Class<?> sourceClass) {
        if (sourceFieldValue == null) 
            return null;
        if (sourceFieldValue instanceof Integer) {
        	int source = (Integer) sourceFieldValue;
    		if(source == 1)
    			return "hello";
    		else if(source == 2)
    			return "hi";
    		else if(source == 3)
    			return "world";
        }
        return "Invalid Value";
	}

}
