package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}
	
	public Anfibio() {
		this(null, 0, null, null, null, false);
	}
	
	public static int cantidadAnfibios() {
		int contador = 0;
		for (int i = 0; i < listado.size(); i++) {
			if (listado.get(i) instanceof Anfibio) {contador++;}
		}
		return contador;
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		
	}
	
	public boolean isVenenoso() {
		return this.venenoso;
	}
	
	public void setVenenoso(boolean s) {
		this.venenoso = s;
	}
	
	public String getColorPiel() {
		return this.colorPiel;
	}
	
	public void setColorPiel(String s) {
		this.colorPiel = s;
	}

}