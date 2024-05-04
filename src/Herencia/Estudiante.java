package Herencia;

public class Estudiante extends Persona{
private int codigoEstudiante;
private float notafinal;
public Estudiante(String nombre, String apellido, int edad,int codigoEstudiante, float notafinal ) {
	super(nombre,apellido,edad);
	this.codigoEstudiante=codigoEstudiante;
	this.notafinal=notafinal;
	
}
public void mostrarDatos() {
	System.out.println("Nombre:"+getNombre()+"\nApellido"+getApellido()+
			"\nEdad:"+getEdad()+"\nCodigo estudiante:"+codigoEstudiante+"\nNota Final:"
			+notafinal);
}
}
