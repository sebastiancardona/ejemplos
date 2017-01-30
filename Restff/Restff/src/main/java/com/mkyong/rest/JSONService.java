package com.mkyong.rest;

import com.mkyong.Empleado;
import java.awt.Image;
import javax.swing.ImageIcon;
import com.mkyong.EmpDao;
import com.mkyong.CountryService; 
import com.sun.research.ws.wadl.Response;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;

import java.util.*;
import java.util.ArrayList;


import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import java.io.File;
import java.io.IOException;

import javax.jws.WebService;
import javax.servlet.http.HttpServletResponse;

//import javax.ws.rs.PathParam;

@Path("/empleado")
public class JSONService {
	ArrayList<Empleado> array = new ArrayList<Empleado>();
	EmpDao empDao = new EmpDao();
	private static final String SUCCESS_RESULT="<result>success</result>";
	private static final String FAILURE_RESULT="<result>failure</result>";
	 CountryService countryService=new CountryService();  
	
	    @GET  
	    @Produces(MediaType.APPLICATION_JSON)  
	 public ArrayList<Empleado> getCountries()  
	 {  
	    
	  ArrayList<Empleado> listOfCountries=countryService.getAllCountries();  
	  return listOfCountries;  
	 }  
	  
	    @GET  
	    @Path("/{id}")  
	    @Produces(MediaType.APPLICATION_JSON)  
	 public Empleado getCountryById(@PathParam("id") int id)  
	 {  
	  return countryService.getCountry(id);  
	 }  
	    @GET  
	    @Path("delete/{id}")  
	    @Produces(MediaType.APPLICATION_JSON)  
	 public void delete(@PathParam("id") int id)  
	 {  
	  countryService.deleteCountry(id);
	 }  
	     
	    @POST  
	    @Produces(MediaType.APPLICATION_JSON)  
	 public Empleado addCountry(Empleado country)  
	 {  
	  return countryService.addCountry(country);  
	 }  
	  
	    @PUT  
	    @Produces(MediaType.APPLICATION_JSON)  
	 public Empleado updateCountry(Empleado country)  
	 {  
	  return countryService.updateCountry(country);  
	    
	 } 
	    @PUT 
	    @Path("saveImg") 
	    @Produces(MediaType.APPLICATION_JSON)  
	 public void updateImg()  
	 {  
	  //return countryService.updateCountry(country);  
	    System.out.println("llegamos al metodo");
	 } 
	    
	    
	 /*@DELETE  
	 @Path("/{id}")  
	 @Produces(MediaType.APPLICATION_JSON)  
	 public void deleteCountryD(@PathParam("id") int id)  
	 {  
	   countryService.deleteCountry(id);  
	    
	 }  */

	
}
