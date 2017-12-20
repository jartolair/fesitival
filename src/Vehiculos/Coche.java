package Vehiculos;

public class Coche extends Vehiculo{
	private String marca;
	
	public Coche(){
		super("coche",4,false);
	}
	

	public Coche(boolean enMarcha,String marca) {
		super("coche",4,enMarcha);
		this.marca = marca;
	}
	public Coche(String marca) {
		super("coche",4,false);
		this.marca = marca;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void mostrarInfo(){
		super.mostrarInfo();
		System.out.println("Es de la marca "+this.marca);
	}
}
