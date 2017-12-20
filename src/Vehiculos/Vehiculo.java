package Vehiculos;

public class Vehiculo {
	private String tipo;
	private int ruedas;
	private boolean enMarcha;
	
	public Vehiculo(){
		
	}
	public Vehiculo(String tipo){
		this.tipo = tipo;
	}

	public Vehiculo(String tipo, int ruedas, boolean enMarcha) {
		this.tipo = tipo;
		this.ruedas = ruedas;
		this.enMarcha = enMarcha;
	}
	
	public void mostrarInfo(){
		System.out.println("Tipo de vehiculo: "+this.tipo);
		System.out.println("Ruedas del vehiculo: "+this.ruedas);
		if (enMarcha){
			System.out.println("Esta en marcha");
		}else{
			System.out.println("No esta en marcha");
		}
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}

	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * @return the enMarcha
	 */
	public boolean isEnMarcha() {
		return enMarcha;
	}

	/**
	 * @param enMarcha the enMarcha to set
	 */
	public void setEnMarcha(boolean enMarcha) {
		this.enMarcha = enMarcha;
	}
	
	
}
