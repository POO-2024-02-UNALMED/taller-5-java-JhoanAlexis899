package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico() {
		this(null, null);
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales() {
		int contador = 0;
		for (int i = 0; i<zonas.size(); i++) {
			contador += zonas.get(i).cantidadAnimales();
		}
		return contador;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String s) {
		this.nombre = s;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	public void setUbicacion(String s) {
		this.ubicacion = s;
	}
	
	public ArrayList<Zona> getZona(){
		return this.zonas;
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
	
}
