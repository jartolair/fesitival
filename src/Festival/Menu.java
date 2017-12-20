package Festival;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		final int CREAR=1;
		final int LEER=2;
		final int EDITAR=3;
		final int BORRAR=4;
		final int SALIR=0;
		String archivo ="D:/ficherosJava/actuaciones.txt";
		
		File fichero=new File(archivo);
		Scanner ficha=new Scanner(fichero);
		
		
		
		ArrayList<Actuacion> actuaciones=new ArrayList<Actuacion>();
		
		Festival festival=new Festival();
		festival.setNombre("Rock an Ring");
		festival.setPatrocinador("Red Bull");
		while(ficha.hasNextLine()){
			String[] linea=ficha.nextLine().split(":");
			int d=Integer.parseInt(linea[1]);
			Actuacion a =new Actuacion(linea[0],d);
			actuaciones.add(a);
		}
		festival.setActuaciones(actuaciones);
		Scanner lector =new Scanner(System.in);
		int opcion;
		do{
			System.out.println("--------MENU---------");
			System.out.println(CREAR+" - Añadir una actuacion");
			System.out.println(LEER+" - Mostrar actuaciones");
			System.out.println(EDITAR+" - Editar una actuacion");
			System.out.println(BORRAR+" - Borrar una actuacion");
			System.out.println(SALIR+" - Salir del menu");
			opcion=Integer.parseInt(lector.nextLine());
			
			switch(opcion){
			case CREAR:
				System.out.println("Introducir nombre:");
				String nombre=lector.nextLine();
				System.out.println("Introducir la duracion");
				int duracion=Integer.parseInt(lector.nextLine());
				Actuacion a=new Actuacion(nombre,duracion);
				festival.addActuacion(a);
				break;
			case LEER:
				festival.mostrarInfo();
				break;
			case EDITAR:
				System.out.println("Introducir nombre:");
				nombre=lector.nextLine();
				System.out.println("Introducir la duracion");
				duracion=Integer.parseInt(lector.nextLine());
				festival.cambiarDuracionActuacion(nombre, duracion);
				break;
			case BORRAR:
				System.out.println("Introducir nombre:");
				nombre=lector.nextLine();
				festival.eliminarActuacion(nombre);
				break;
			case SALIR:
				System.out.println("Saliendo...");
				guardarDatos(actuaciones,archivo);
				break;
			default:
				System.out.println("Esa opcion no existe");
				break;
			}
			
		}while(opcion!=SALIR);
		

	}
	
	public static void guardarDatos(ArrayList<Actuacion> actuaciones,String archivo){
		FileWriter fw=null;
		try {
			fw=new FileWriter(archivo);
			PrintWriter pw=new PrintWriter(fw);
			
			Iterator<Actuacion> i=actuaciones.iterator();
			while(i.hasNext()){
				Actuacion ac=i.next();
				pw.println(ac.getNombreGrupo()+":"+ac.getDuracion());
			}
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*
In Flames:76
Five Finger Death Punch:64
Disturbed:67
Trivium:99
Audioslave:80
*/