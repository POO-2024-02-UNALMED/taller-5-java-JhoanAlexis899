package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}
	
	public Ave() {
		this(null, 0, null, null,null);
	}
	
	
	public static int cantidadAves() {
		int contador = 0;
		for (int i = 0; i < listado.size(); i++) {
			if (listado.get(i) instanceof Ave) {contador++;}
		}
		return contador;
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave.halcones++;
		return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave.aguilas++;
		return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
	}
	
	public String getColorPlumas() {
		return this.colorPlumas;
	}
	
	public void setColorPlumas(String s) {
		this.colorPlumas = s;
	}

}