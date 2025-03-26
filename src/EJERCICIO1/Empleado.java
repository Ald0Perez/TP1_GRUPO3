package EJERCICIO1;

public class Empleado {
	
	final int   id ;
	String nombre;
	int edad;
	private static int  cont=999;
	
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
		cont++;
		this.id=cont;
		this.nombre="Sin Nombre";
		this.edad =99;
		
	}
	
	public Empleado(String Nombre,int edad) {
			cont++;
		this.id=cont;
		this.nombre=Nombre;
		this.edad =edad;
	
	}
	public int DevuelveProximoId() {
		return cont+1;
		
	}


	@Override
	public String toString() {
		return "Legajo:" + id + ", Empleado=" + nombre + ", Edad=" + edad ;
	}


}
