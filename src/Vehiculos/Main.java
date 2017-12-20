package Vehiculos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avion a=new Avion(3, false);
		Avion a2=new Avion();
		a.mostrarInfo();
		System.out.println("__________");
		a2.mostrarInfo();
		System.out.println("__________");
		
		
		Coche c=new Coche("Opel");
		Coche c2=new Coche(false, "Opel");
		c.mostrarInfo();
		System.out.println("__________");
		c2.mostrarInfo();
		
	}

}
