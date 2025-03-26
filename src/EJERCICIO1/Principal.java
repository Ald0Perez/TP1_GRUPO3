package EJERCICIO1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado []vEmp=new Empleado [5];
		vEmp [0] = new Empleado("Aldo",20);
		 vEmp[1] = new Empleado("Lucas",33);
		 vEmp[2] = new Empleado();
		 vEmp[3] = new Empleado("Juan",27);
		 vEmp[4] = new Empleado("Roberto",106);
	
		 for (Empleado empleado : vEmp) {
			System.out.println(empleado.toString()) ; 
		}
		System.out.println("El proximo ID es "+vEmp[4].DevuelveProximoId());
	}

}
