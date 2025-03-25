package EJERCICIO1;

public class Empleado {
	
	final int   id ;
	String nombre;
	int edad;
	private static int  cont=1000;
	
	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Empleado() {
		
		this.id=cont;
		this.nombre="Sin Nombre";
		this.edad =99;
		cont++;
	}
	
	public Empleado(String Nombre,int edad) {
		
		this.id=cont;
		this.nombre=Nombre;
		this.edad =edad;
		cont++;
	}

	public int DevuelveProximoId() {
		return cont;
		
	}


	@Override
	public String toString() {
		return "Legajo:" + id + ", Empleado=" + nombre + ", Edad=" + edad ;
	}


}
