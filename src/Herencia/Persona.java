package Herencia;

public class Persona {
private String nombre;
private String apellido;
private int edad;





public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
public int getEdad() {
	return edad;
}
public Persona(String nombre, String apellido, int edad) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}

}
