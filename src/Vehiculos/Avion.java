package Vehiculos;

public class Avion extends Vehiculo{
	private boolean volando;

	public Avion() {
		super("Avion");
	}
	
	public Avion(int ruedas, boolean volando){
		super("Avion", ruedas, volando);
		this.volando=volando;
	}
	public Avion(int ruedas){
		super("Avion", ruedas, false);
		this.volando=false;
	}

	/**
	 * @return the volando
	 */
	public boolean isVolando() {
		return volando;
	}

	/**
	 * @param volando the volando to set
	 */
	public void setVolando(boolean volando) {
		this.volando = volando;
	}
	
	public void mostrarInfo(){
		super.mostrarInfo();
		if(volando){
			System.out.println("Esta volando");
		}else{
			System.out.println("No esta volando");
		}
			
		
	}
}
