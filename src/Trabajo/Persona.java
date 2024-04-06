package Trabajo;

public class Persona 
{
	
String nombre;
int edad;

	

	public String getNombre() 
	{
		return nombre;
	}


	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}


	public int getEdad() 
	{
		return edad;
	}


	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	
	public PersonaEFS(String nombre, int edad) 
	{
			
	this.nombre= nombre;
	this.edad= edad;

	}
	
}
