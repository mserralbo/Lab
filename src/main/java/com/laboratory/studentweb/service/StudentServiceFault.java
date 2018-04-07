/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratory.studentweb.service;

/**
 *
 * @author Miriam
 */
public class StudentServiceFault {
 private static final String DEFAULT_MESSAGE = "name cannot be null or empty";
 
 
protected String message;
 
public String getMessage() {
 
return message;
 
}
 
public void setMessage(String message) {
 
this.message = message;
 
}
 
 
public static StudentServiceFault defaultInstance() {
 
StudentServiceFault fault = new StudentServiceFault();
 
fault.message = DEFAULT_MESSAGE;
 
return fault;
 
}   
}
