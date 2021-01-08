package com.micro.commons.handler.exceptions;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ErrorMessages implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7092916479502830336L;
	
	String id;
	List<Map<String,String>> errors;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Map<String, String>> getErrors() {
		return errors;
	}
	public void setErrors(List<Map<String, String>> errors) {
		this.errors = errors;
	}
	public ErrorMessages(String id, List<Map<String, String>> errors) {
		this.id = id;
		this.errors = errors;
	}
	public ErrorMessages() {
	}
	
	
	

}
