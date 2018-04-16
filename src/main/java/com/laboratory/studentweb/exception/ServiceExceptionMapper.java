/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laboratory.studentweb.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
 
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import com.laboratory.studentweb.exception.ErrorMessage;
import com.laboratory.studentweb.exception.ServiceException;



/**
 *
 * @author Miriam
 */
@Provider
public class ServiceExceptionMapper implements ExceptionMapper;ServiceException;{
 
    @Override
    public Response toResponse(ServiceException ex) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setCode(ex.getCode());
        errorMessage.setMessage(ex.getMessage());
        StringWriter errorStackTrace = new StringWriter();
        ex.printStackTrace(new PrintWriter(errorStackTrace));
        errorMessage.setDeveloperMessage(ex.toString());
        return Response.status(ex.getHttpStatus()).entity(errorMessage).type(MediaType.APPLICATION_JSON).build();
    }
 
}
