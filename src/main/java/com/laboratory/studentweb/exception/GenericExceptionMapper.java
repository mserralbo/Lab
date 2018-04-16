/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratory.studentweb.exception;


import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author Miriam
 */

@Provider
public class GenericExceptionMapper implements ExceptionMapper;Throwable; {
 
    public Response toResponse(Throwable ex) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(ex.getMessage());
        StringWriter errorStackTrace = new StringWriter();
        ex.printStackTrace(new PrintWriter(errorStackTrace));
        errorMessage.setDeveloperMessage(ex.toString());
        return Response.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).entity(errorMessage)
                .type(MediaType.APPLICATION_JSON).build();
    }
 
}
