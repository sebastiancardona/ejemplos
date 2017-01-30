package com.mkyong;

import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.List;

import java.awt.Image;
import javax.swing.ImageIcon; 
  

  
/* 
 * It is just a helper class which should be replaced by database implementation. 
 * It is not very well written class, it is just used for demonstration. 
 */  
public class CountryService {  
  
 static HashMap<Integer,Empleado> countryIdMap=getCountryIdMap();  
 String route="http://localhost:8080/Restff/src/images/defaultImg.png" ;
 Image imagenExterna = new ImageIcon(route).getImage();

  
 public CountryService() {  
  super();  
  
  if(countryIdMap==null)  
  {  
   countryIdMap=new HashMap<Integer,Empleado>();  
  // Creating some objects of Country while initializing  
     
   countryIdMap.put(1,(new Empleado(1,"Miguel","Admin",30,route)));
   countryIdMap.put(2,(new Empleado(2,"Juan","Contador",45,route)));
   countryIdMap.put(3, (new Empleado(3,"Pedro","Tecnico",34,route)));
   countryIdMap.put(4, (new Empleado(4,"Daniela","Secretaria",20,route)));
   countryIdMap.put(5, (new Empleado(5,"Sebas","Tecnico",34,route)));
   countryIdMap.put(6, (new Empleado(6,"Camila","Dev1",34,route)));
   countryIdMap.put(7, (new Empleado(7,"Ana","Dev1",34,route)));
   countryIdMap.put(8, (new Empleado(8,"Juli","Dev2",34,route)));
   countryIdMap.put(9, (new Empleado(9,"Jose","Dev2",34,route)));
   countryIdMap.put(10, (new Empleado(10,"Teo","Dev3",34,route)));
  
  
  }  
 }  
  
 public ArrayList<Empleado> getAllCountries()  
 {  
  ArrayList<Empleado> countries = new ArrayList<Empleado>(countryIdMap.values());  
  return countries;  
 }  
 public String setImg(Empleado emp,Image img) { 
 	//emp.setImg(img.getName());
 	//saveImg();
 	
 	return "good";
 }
 
 public Empleado getCountry(int id)  
 {  
  Empleado country= countryIdMap.get(id);  
  return country;  
 }  
 public Empleado addCountry(Empleado country)  
 {  
  country.setId(countryIdMap.size()+1);  
  countryIdMap.put(country.getId(), country);  
  return country;  
 }  
   
 public Empleado updateCountry(Empleado country)  
 {  
  if(country.getId()<=0)  
   return null;  
  countryIdMap.put(country.getId(), country);  
  return country;  
  
 }  
 public void deleteCountry(int id)  
 {  
  countryIdMap.remove(id);  
 }  
  
 public static HashMap<Integer, Empleado> getCountryIdMap() {  
  return countryIdMap;  
 }  
}  

