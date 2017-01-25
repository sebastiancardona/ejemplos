package com.mkyong.rest;

import com.mkyong.Empleado;
import com.sun.research.ws.wadl.Response;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import java.util.*;
import java.util.ArrayList;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/empleado")
public class JSONService {
	ArrayList<Empleado> array = new ArrayList<Empleado>();
	
	public JSONService() {createArray();}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Empleado> getTrackInJSON() {
		//System.out.println("Sebas");
		return array;
	}
	
	@GET
	@Path("/buscar")
	@Produces(MediaType.APPLICATION_JSON)
	public Empleado getEmp(@QueryParam("name") String name) {
	    Empleado emp1=null;
	    
	    //System.out.println(name);
	   for (int i = 0; i < array.size(); i++) {
	    	Empleado emp=array.get(i);
			if(name.equals(emp.getName())){
				emp1=emp;
			}
			//System.out.println("Sebas2");
		}
	
		return emp1;
	}
	public void createArray() {
		array.add( new Empleado(10,"Miguel","Admin",30));
		array.add( new Empleado(11,"Juan","Contador",45));
		array.add( new Empleado(12,"Pedro","Tecnico",34));
		array.add( new Empleado(13,"Daniela","Secretaria",20));
	}
	
	
}
