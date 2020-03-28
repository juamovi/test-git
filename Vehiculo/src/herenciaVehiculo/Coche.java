package herenciaVehiculo;

public class Coche extends Vehiculo{

	//Campo espec�fico de Coche
	private int cilindrada;

	public Coche() {

	}
	//Constructor de la subclase
	public Coche(int km, String matricula) {
		super(km, matricula);
	}

	//o podemos tener tambi�n otro constructor en la subclase
	public Coche(int km, String matricula, int cilindrada) {
		super(km, matricula);
		this.cilindrada = cilindrada; //Atributo espec�fico de la subclase.
	}
	//Metodos espec�ficos de Coche
	public void setCilindrada(int cilindrada){
		this.cilindrada = cilindrada;
	}

	public int getCilindrada(){
		return cilindrada;
	}

	public void mostrarDatos(){
		//puedo acceder al atributo matricula
		System.out.println("La matricula del coche es: " + matricula);

		//No puedo acceder al atributo kilometros
		System.out.println("Los km del coche son: " + this.getKm()); //Error de compilaci�n
	}

	@Override
	public void arrancar(){
		//modificamos el comportamiento del m�todo
		System.out.println("Coche arrancado...");
	}

	@Override
	public String toString(){
		//System.out.println( "Coche- matricula : " + this.matricula + " cilindrada: " + this.cilindrada +  "Kilometros: " + getKm());
		return "Coche- matricula : " + this.matricula + " cilindrada: " + this.cilindrada +  "Kilometros: " + getKm();
	}
}
