package Festival;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//crear una actuacion por programacion
		Actuacion a1 =new Actuacion();
		a1.setNombreGrupo("In Flames");
		a1.setDuracion(90);
		
		/*//crear una actuacion por teclado
		Actuacion a2 =new Actuacion();
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce un nombre de grupo:");
		a2.setNombreGrupo(lector.nextLine());
		System.out.println("Introduce la duracion de actuacion:");
		a2.setDuracion(Integer.parseInt(lector.nextLine()));*/
		
		//crear actuacion por fichero
		File fichero=new File("D:/ficherosJava/actuaciones.txt");
		Scanner ficha;
		Actuacion a3=new Actuacion();;
		try {
			ficha = new Scanner(fichero);
			while(ficha.hasNextLine()){
				String[] linea = ficha.nextLine().split(":");
				a3.setNombreGrupo(linea[0]);
				a3.setDuracion(Integer.parseInt(linea[1]));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Festival festival=new Festival();
		festival.setNombre("Rock and Ring");
		festival.setPatrocinador("Heineken");
		ArrayList<Actuacion> actuaciones=new ArrayList<Actuacion>();
		actuaciones.add(a1);
		//actuaciones.add(a2);
		actuaciones.add(a3);
		festival.setActuaciones(actuaciones);
		
		Actuacion a4 =new Actuacion();
		a4.setNombreGrupo("Five Finger Death Punch");
		a4.setDuracion(100);
		festival.addActuacion(a4);
		
		festival.addActuacion("Bury Tomorrow", 95);
		
		festival.mostrarInfo();
		
		
		Actuacion a5 =new Actuacion();
		a5.setNombreGrupo("Rammstein");
		a5.setDuracion(100);
		festival.addActuacion(a5);

		
		festival.mostrarInfo();
		
	}

}
