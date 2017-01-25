package com.mkyong;

public class  Empleado {
	int id;
	String name;
	String cargo;
	int edad;

	public Empleado(){
		
		
	}
	public Empleado(int id,String name, String cargo,int edad){
		this.id = id;
		this.name = name;
		this.cargo = cargo;
		this.edad = edad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	

}
