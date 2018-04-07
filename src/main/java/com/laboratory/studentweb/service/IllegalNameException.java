/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratory.studentweb.service;

import javax.xml.ws.WebFault;
@WebFault(faultBean = "controller.StudentServiceFault")
public class IllegalNameException extends Exception {
    
private static final long serialVersionUID = -6647544772732631047L;
 
private final StudentServiceFault fault;
 
public IllegalNameException(String message, StudentServiceFault fault) {
 
super(message);
 
this.fault = fault;
 
}
 
public IllegalNameException(String message, StudentServiceFault fault, Throwable cause) {
 
super(message, cause);
 
this.fault = fault;
 
}
 
public StudentServiceFault getFaultInfo() {
 
return fault;
 
}
}
