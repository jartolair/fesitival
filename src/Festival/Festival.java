package Festival;

import java.util.ArrayList;
import java.util.Iterator;



public class Festival {
	private String nombre;
	private String patrocinador;
	private ArrayList<Actuacion> actuaciones;
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the patrocinador
	 */
	public String getPatrocinador() {
		return patrocinador;
	}
	/**
	 * @param patrocinador the patrocinador to set
	 */
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	/**
	 * @return the actuaciones
	 */
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	/**
	 * @param actuaciones the actuaciones to set
	 */
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}
	
	public void addActuacion(Actuacion a){
		this.actuaciones.add(a);
	}
	
	public void addActuacion(String nombre, int duracion){
		Actuacion a =new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		this.actuaciones.add(a);
	}
	
	public void mostrarInfo(){
		System.out.println(this.getNombre());
		System.out.println("Patrocinado por "+getPatrocinador());
		System.out.println("-------------------");
		
		Iterator<Actuacion> i =actuaciones.iterator();
		while(i.hasNext()){
			String info =i.next().getInfo();
			System.out.println(info);
		}

	}
	
	public void eliminarActuacion(String grupo){
		Iterator<Actuacion> i=this.actuaciones.iterator();
		while(i.hasNext()){
			if (i.next().getNombreGrupo().equals(grupo)){
				i.remove();
			}
		}
	}
	
	public void cambiarDuracionActuacion(String nombre_grupo, int duracion){
		for (int i=0; i<this.actuaciones.size();i++){
			if(this.actuaciones.get(i).getNombreGrupo().equals(nombre_grupo)){
				//Actuacion a=new Actuacion(nombre_grupo, duracion);
				Actuacion a=this.actuaciones.get(i);
				a.setDuracion(duracion);
				this.actuaciones.set(i, a);
			}
		}
	}
}
