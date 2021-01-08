package com.micro.commons.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.validation.BindingResult;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.micro.commons.handler.exceptions.ErrorMessages;


public abstract class ControllerUtil {
	
	
	
   public String getFormatMessage (BindingResult result) {
		
		List<Map<String,String>> errors = result.getFieldErrors().stream().map(error -> {
			Map<String,String> err = new HashMap<>();
			err.put(error.getField(), error.getDefaultMessage());
			return err;
		}).collect(Collectors.toList());
		
		ErrorMessages err =  new ErrorMessages("01",errors);
		
		ObjectMapper mapper= new ObjectMapper();
		
		 String jsonError="";
		 
		 try {
			jsonError=mapper.writeValueAsString(err);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		return jsonError;
	}

}
