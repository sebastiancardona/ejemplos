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
//import javax.servlet.http.HttpServletResponse;

//import javax.ws.rs.PathParam;

@Path("/empleado")
public class JSONService {
	ArrayList<Empleado> array = new ArrayList<Empleado>();
	EmpDao empDao = new EmpDao();
	private static final String SUCCESS_RESULT="<result>success</result>";
	private static final String FAILURE_RESULT="<result>failure</result>";
	 CountryService countryService=new CountryService();  
	/*@GET
	@Path("/buscar")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Empleado> getListEmp() {
		System.out.println("Sebas");
		return empDao.getAllUsers();
	}
	
	@GET
	@Path("/buscar/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Empleado getEmp(@PathParam(value = "id") int id) {
		//int id2 = Integer.parseInt(id);
		System.out.println(id);
		return empDao.getUser(id);
		
	}
	
	 @PUT
	   @Path("/buscar")
	   @Produces(MediaType.APPLICATION_JSON)
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	   public String updateUser(@FormParam("id") int id,
	      @FormParam("nombre") String name,
	      @FormParam("cargo") String cargo,
	      @FormParam("edad") int edad,
	      @Context HttpServletResponse servletResponse) throws IOException{
	      Empleado user = new Empleado(id, name, cargo,edad);
	      int result = empDao.updateUser(user);
	      if(result == 1){
	    	  return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }
	 
	 
	   @POST
	   @Path("/buscar")
	   @Produces(MediaType.APPLICATION_XML)
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	   public String createUser(@FormParam("id") int id,
		  @FormParam("nombre") String name,
		  @FormParam("cargo") String cargo,
		  @FormParam("edad") int edad,
	      @Context HttpServletResponse servletResponse) throws IOException{
		  Empleado user = new Empleado(id, name, cargo,edad);
	      int result = empDao.addUser(user);
	      if(result == 1){
	         return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }

	  

	   @DELETE
	   @Path("/buscar/{userid}")
	   @Produces(MediaType.APPLICATION_XML)
	   public String deleteUser(@PathParam("userid") int userid){
	      int result = empDao.deleteUser(userid);
	      if(result == 1){
	         return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }	*/
	   
	  
	   
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
	    
	    
	 @DELETE  
	 @Path("/{id}")  
	 @Produces(MediaType.APPLICATION_JSON)  
	 public void deleteCountryD(@PathParam("id") int id)  
	 {  
	   countryService.deleteCountry(id);  
	    
	 }  

	
}
