package herenciaVehiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Vehiculo miVehiculo = new Vehiculo(10000, "0000PRG");
		   
		   Coche miCoche = new Coche(5000,"9999PRG",2000);
		 
		   miVehiculo.arrancar(); 
		   miCoche.arrancar(); //Muestra: "Coche arrancado...");
		   miCoche.mostrarDatos(); //Muestra la matrícula
		   System.out.println(miCoche.toString());
	}

}
