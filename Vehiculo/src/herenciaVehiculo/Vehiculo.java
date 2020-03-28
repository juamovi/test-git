package herenciaVehiculo;

public class Vehiculo {
	   private int km;
	   protected String matricula;
	 
	   public Vehiculo() {		   
	   }
	   
	   public Vehiculo(int km, String matricula) {
		      this.km = km;
		      this.matricula = matricula;
	   }
	   
	   
	   public int getKm(){
	      return km;
	   }
	 
	   public void setKm(int km){
	      this.km = km;
	   }
	 
	   public String getMatricula(){
	      return matricula;
	   }
	 
	   public void setMatricula(String matricula){
	      this.matricula = matricula;
	   }
	   
	   public void arrancar(){
		      System.out.println("Vehiculo arrancado...");
	   }
}
